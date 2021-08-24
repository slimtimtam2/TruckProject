package com.example.demo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TruckRepository repository) throws IOException {
        // open file input stream
        BufferedReader reader = new BufferedReader(new FileReader(
                "src/main/java/com/example/demo1/Mobile_Food_Facility_Permit.csv"));

        // read file line by line
        String line = null;
        Scanner scanner = null;
        List<Truck> truckList = new ArrayList<>();

        while ((line = reader.readLine()) != null) {
            Truck foodTruck = new Truck();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            String[] elem = line.split(",");
            foodTruck.setLocationId(elem[0]);
            foodTruck.setApplicant(elem[1]);
            foodTruck.setFacilityType(elem[2]);
            foodTruck.setAddress(elem[5]);
            foodTruck.setBlocklot(elem[6]);
            foodTruck.setBlock(elem[7]);
            foodTruck.setLot(elem[8]);
//		foodTruck.setZipCodes(elem[27]);
            repository.save(foodTruck);
            truckList.add(foodTruck);
        }

        //close reader
        reader.close();

        System.out.println(truckList);

        return args -> {
            log.info("Preloading " + repository);
        };
    }

}