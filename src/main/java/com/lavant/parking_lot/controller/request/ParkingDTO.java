package com.lavant.parking_lot.controller.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingDTO {
    private String name;
    private int slotsNumber;
}