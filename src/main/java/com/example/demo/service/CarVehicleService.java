package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import static org.slf4j.LoggerFactory.*;


public class CarVehicleService implements VehicleService {

    private Logger logger = LoggerFactory.getLogger(CarVehicleService.class);
    @Override
    public void startEngine() {
        logger.info("Start engine");
    }

    @Override
    public void move() {
        logger.info("Driving");
    }

    @Override
    public void stopEngine() {
        logger.info("Stop engine");
    }
}
