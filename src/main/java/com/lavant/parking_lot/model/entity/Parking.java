package com.lavant.parking_lot.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "parking")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String name;
    @NotNull
    private Integer slotsNumber;
}
