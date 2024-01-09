package com.lavant.parking_lot.service.impl;

import com.lavant.parking_lot.controller.request.ParkingDTO;
import com.lavant.parking_lot.model.entity.Parking;
import com.lavant.parking_lot.repositories.ParkingRepository;
import com.lavant.parking_lot.service.ParkingService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingServiceImpl implements ParkingService {
    private final ParkingRepository repository;

    @Autowired
    public ParkingServiceImpl(ParkingRepository repository) {
        this.repository = repository;
    }

    @Transactional
    @Override
    public boolean save(ParkingDTO request) {
        repository.save(createParking(request));
        return true;
    }

    private Parking createParking(ParkingDTO request) {
        return Parking.builder().
                name(null).
                slotsNumber(request.getSlotsNumber()).
                build();
    }
}