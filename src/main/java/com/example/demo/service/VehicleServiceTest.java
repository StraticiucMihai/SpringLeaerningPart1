package com.example.demo.service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Qualifier("car")
@ComponentScan("com.example.demo.service")
public class VehicleServiceTest {
    @Autowired
    @Qualifier("car")
    VehicleService vehicleService;/*error from intelliJ*/

    public void testVehicle(){
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
    }
}
