package com.example.demo;

import com.example.demo.service.VehicleServiceTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
//        VehicleService vehicleService = context.getBean(VehicleService.class);
//        vehicleService.startEngine();
//        vehicleService.move();
//        vehicleService.stopEngine();
        VehicleServiceTest vehicleServiceTest = context.getBean(VehicleServiceTest.class);
        vehicleServiceTest.testVehicle();
    }

}
