package com.example.demo1;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface TruckRepository extends JpaRepository<Truck, String> {
    List<Truck> findByBlock(String block);
}
