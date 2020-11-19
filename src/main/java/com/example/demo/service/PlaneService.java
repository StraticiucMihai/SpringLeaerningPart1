package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaneService implements VehicleService {

    private Logger log = LoggerFactory.getLogger(PlaneService.class);
    @Override
    public void startEngine() {
        log.info("Start fly ");

    }

    @Override
    public void move() {
        log.info("Fly");

    }

    @Override
    public void stopEngine() {
        log.info("Stop flying");

    }
}
