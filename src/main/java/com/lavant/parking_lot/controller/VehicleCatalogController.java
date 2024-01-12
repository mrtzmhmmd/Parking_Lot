package com.lavant.parking_lot.controller;

import com.lavant.parking_lot.domain.dto.VehicleCatalogDTO;
import com.lavant.parking_lot.service.VehicleCatalogService;
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
@RequestMapping("/api/v1/vehicle-catalog")
@Validated
public class VehicleCatalogController {

    private final VehicleCatalogService vehicleCatalogService;

    @Autowired
    public VehicleCatalogController(VehicleCatalogService vehicleCatalogService) {
        this.vehicleCatalogService = vehicleCatalogService;
    }

    @PostMapping("/save")
    public ResponseEntity<Void> save(@RequestBody @Valid VehicleCatalogDTO request) {
        vehicleCatalogService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
