package com.lavant.parking_lot.model.entity;

import com.lavant.parking_lot.model.enums.ParkingSpotStatus;

public class ParkingSpot {

    private long id;
    private ParkingSpotStatus status;
    private VehicleCatalog vehicleId;
}
