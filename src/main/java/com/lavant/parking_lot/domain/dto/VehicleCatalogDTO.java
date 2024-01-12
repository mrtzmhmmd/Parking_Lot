package com.lavant.parking_lot.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class VehicleCatalogDTO {
    private String name;
    private Integer size;
}