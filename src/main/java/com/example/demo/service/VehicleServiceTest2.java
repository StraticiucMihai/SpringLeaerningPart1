package com.example.demo.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Data
//@RequiredArgsConstructor

//@NoArgsConstructor
@Component
public class VehicleServiceTest2 {

    private Engine engine;

    private Transmision transmision;

    public VehicleServiceTest2(Engine engine ,Transmision transmision){
        this.engine = engine;
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "VehicleServiceTest2{" +
                "engine=" + engine +
                ", transmision=" + transmision +
                '}';
    }

}
