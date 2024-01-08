package com.lavant.parking_lot.controller;

import com.lavant.parking_lot.controller.request.ParkingDTO;
import com.lavant.parking_lot.service.ParkingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parking")
@Validated
public class ParkingController {

    private final ParkingService parkingService;

    @Autowired
    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @PostMapping("/save")
    public ResponseEntity<Boolean> save(@RequestBody @Valid ParkingDTO request) {
        boolean response = parkingService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}