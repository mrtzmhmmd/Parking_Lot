package com.lavant.parking_lot.domain.entity;

import com.lavant.parking_lot.domain.enums.SpotStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

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
    @ManyToMany(mappedBy = "slots")
    private Set<Ticket> tickets = new HashSet<>();
    @Enumerated(EnumType.STRING)
    private SpotStatus status;
}