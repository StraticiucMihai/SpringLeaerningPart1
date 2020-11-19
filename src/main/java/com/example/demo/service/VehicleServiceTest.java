package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceTest {

    @Autowired
   @Qualifier("plane") // poate fi car atunci injecteaza cealalta clasa
    VehicleService vehicleService;/*error from intelliJ*/

    public void testVehicle(){
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }
}
