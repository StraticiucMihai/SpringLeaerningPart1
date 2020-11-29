package com.example.demo.configuration;

import com.example.demo.service.CarVehicleService;
import com.example.demo.service.PlaneService;
import com.example.demo.service.VehicleService;
import com.example.demo.service.VehicleServiceTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {


    @Bean(name = "car")
//    @Qualifier("car")
    public VehicleService carVehicleServiceConfigure(){
        return new CarVehicleService();
    }
    @Bean(name = "plane")
//    @Primary
//    @Qualifier("plane")
    public VehicleService planeVehicleServiceConfiguration(){

        return new PlaneService();
    }
    @Bean
    public VehicleServiceTest vehicleServiceTest(){
        return  new VehicleServiceTest();
    }
}
