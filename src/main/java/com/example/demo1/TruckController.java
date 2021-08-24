package com.example.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TruckController {


    private final TruckRepository repository;

    TruckController(TruckRepository repository){
        this.repository = repository;
    }

    @GetMapping("/trucks")
    List<Truck> all() {
        return repository.findAll();
    }

    @PostMapping("/trucks")
    Truck addTruck(@RequestBody Truck truck){
        return repository.save(truck)
    }

    @GetMapping("/trucks/{id}")
    Truck truckByLocationId(@PathVariable String id) {

        return repository.findById(id)
                .orElseThrow();
    }

    @GetMapping("/trucks/block/{block}")
    List<Truck> truckByBlock(@PathVariable String block) {
        List<Truck> blockList;
        blockList = repository.findByBlock(block);
       return blockList;
    }
}
