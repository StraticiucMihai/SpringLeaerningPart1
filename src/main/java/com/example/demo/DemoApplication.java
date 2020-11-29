package com.example.demo;

import com.example.demo.configuration.AppConfiguration;
import com.example.demo.service.CarVehicleService;
import com.example.demo.service.PlaneService;
import com.example.demo.service.VehicleService;
import com.example.demo.service.VehicleServiceTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication

public class DemoApplication {

    public static void main(String[] args) {
//        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        VehicleService vehicleService = context.getBean(PlaneService.class);
        vehicleService.startEngine();
        vehicleService.move();
        vehicleService.stopEngine();
        VehicleServiceTest vehicleServiceTest = context.getBean(VehicleServiceTest.class);
        vehicleServiceTest.testVehicle();
    }

}
