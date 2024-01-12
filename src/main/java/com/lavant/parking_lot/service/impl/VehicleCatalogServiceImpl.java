package com.lavant.parking_lot.service.impl;

import com.lavant.parking_lot.domain.dto.VehicleCatalogDTO;
import com.lavant.parking_lot.domain.entity.VehicleCatalog;
import com.lavant.parking_lot.repositories.VehicleCatalogRepository;
import com.lavant.parking_lot.service.VehicleCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleCatalogServiceImpl implements VehicleCatalogService {

    private final VehicleCatalogRepository repository;

    @Autowired
    public VehicleCatalogServiceImpl(VehicleCatalogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(VehicleCatalogDTO vehicleCatalogDTO) {
        repository.save(createVehicleCatalog(vehicleCatalogDTO));
    }

    private VehicleCatalog createVehicleCatalog(VehicleCatalogDTO vehicleCatalogDTO) {
        return VehicleCatalog.builder().
                name(vehicleCatalogDTO.getName()).
                size(vehicleCatalogDTO.getSize()).
                build();
    }
}
