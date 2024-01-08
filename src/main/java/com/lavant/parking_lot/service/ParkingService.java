package com.lavant.parking_lot.service;

import com.lavant.parking_lot.controller.request.ParkingDTO;

public interface ParkingService {
    boolean save(ParkingDTO request);
}
