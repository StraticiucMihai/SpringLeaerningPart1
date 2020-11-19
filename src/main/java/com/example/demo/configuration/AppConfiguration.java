package com.example.demo.configuration;

import com.example.demo.service.CarVehicleService;
import com.example.demo.service.PlaneService;
import com.example.demo.service.VehicleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {


    @Bean(name = "car")
//    @Qualifier("car")
//    @ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "car")
    public VehicleService carVehicleServiceConfigure(){
        return new CarVehicleService();
    }
    @Bean(name = "plane")
//   @Primary
//    @Qualifier("plane")
//    @ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "plane")
    public VehicleService planeVehicleServiceConfiguration(){

        return new PlaneService();
    }
}
