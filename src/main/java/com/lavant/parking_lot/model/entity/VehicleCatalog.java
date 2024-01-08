package com.lavant.parking_lot.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "vehicle_catalog")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleCatalog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "vehicleCatalog", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> vehicleCatalog = new ArrayList<>();
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "size")
    private Integer spotsNeeded;
}