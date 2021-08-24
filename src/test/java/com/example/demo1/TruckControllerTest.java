package com.example.demo1;


import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class TruckControllerTest {

    @Mock private TruckRepository truckRepository;
    @InjectMocks TruckController truckController = new TruckController(truckRepository);


    @Test
    public void testFindByLocationId(){
        Truck truck1 = new Truck();
        truck1.setLocationId("12345");
        truckRepository = mock(TruckRepository.class);
        truckController = new TruckController(truckRepository);
        when(truckRepository.findById("12345")).thenReturn(Optional.of(truck1));
       Truck truck2 = truckController.truckByLocationId("12345");
                assertEquals(truck2,truck1);
    }

    @Test
    public void testFindByBlock(){
        Truck truck1 = new Truck();
        truck1.setBlock("12345");
        Truck truck2 = new Truck();
        truck2.setBlock("12345");
        List<Truck> listTrucks= new ArrayList<>();
        listTrucks.add(truck1);
        listTrucks.add(truck2);
        truckRepository = mock(TruckRepository.class);
        truckController = new TruckController(truckRepository);
        when(truckRepository.findByBlock("12345")).thenReturn(listTrucks);
        List<Truck> expectedList = truckController.truckByBlock("12345");
        assertEquals(expectedList,listTrucks);
    }
    @Test
    public void testFindAll(){
        Truck truck1 = new Truck();
        truck1.setBlock("12345");
        Truck truck2 = new Truck();
        truck2.setBlock("12345");
        Truck truck3 = new Truck();
        truck3.setBlock("65445");
        List<Truck> listTrucks= new ArrayList<>();
        listTrucks.add(truck1);
        listTrucks.add(truck2);
        truckRepository = mock(TruckRepository.class);
        truckController = new TruckController(truckRepository);
        when(truckRepository.findAll()).thenReturn(listTrucks);
        List<Truck> expectedList = truckController.all();
        assertEquals(expectedList,listTrucks);
    }
}
