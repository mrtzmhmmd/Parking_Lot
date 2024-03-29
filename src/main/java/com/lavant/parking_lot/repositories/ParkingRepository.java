package com.lavant.parking_lot.repositories;

import com.lavant.parking_lot.domain.entity.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
