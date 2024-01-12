package com.lavant.parking_lot.service.impl;

import com.lavant.parking_lot.domain.dto.ParkingDTO;
import com.lavant.parking_lot.domain.entity.Parking;
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
    public void save(ParkingDTO parkingDTO) {
        repository.save(createParking(parkingDTO));
    }

    private Parking createParking(ParkingDTO parkingDTO) {
        return Parking.builder().
                name(parkingDTO.getName()).
                address(parkingDTO.getAddress()).
                slotsNumber(parkingDTO.getSlotsNumber()).
                build();
    }
}