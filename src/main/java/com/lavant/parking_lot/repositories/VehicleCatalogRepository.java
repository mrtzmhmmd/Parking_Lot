package com.lavant.parking_lot.repositories;

import com.lavant.parking_lot.domain.entity.VehicleCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCatalogRepository extends JpaRepository<VehicleCatalog, Long> {
}
