package com.example.demo;

import com.example.demo.configuration.AppConfiguration;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
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

        VehicleServiceTest2 vehicleServiceTest2 = context.getBean(VehicleServiceTest2.class);
        System.out.println(vehicleServiceTest2.toString());
    }

}
