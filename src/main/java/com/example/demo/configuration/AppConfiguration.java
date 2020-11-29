package com.example.demo.configuration;

import com.example.demo.service.*;
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
    @Bean
    public VehicleServiceTest2 vehicleServiceTest2(Engine engine , Transmision transmision){
        return  new VehicleServiceTest2(engine, transmision);
    }
    @Bean
    public Engine engine(){
        return new Engine("v8",8);
    }
    @Bean
    public Transmision transmision(){
        return new Transmision("Standart");
    }
}
