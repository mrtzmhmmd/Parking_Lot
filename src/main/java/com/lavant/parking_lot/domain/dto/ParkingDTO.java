package com.lavant.parking_lot.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParkingDTO {
    private String name;
    private int slotsNumber;
    private String address;
}