package com.lavant.parking_lot.model.entity;

import com.lavant.parking_lot.model.enums.SpotStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "slot")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Slot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Enumerated(EnumType.STRING)
    private SpotStatus status;
}