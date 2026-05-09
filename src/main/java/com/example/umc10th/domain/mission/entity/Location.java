package com.example.umc10th.domain.mission.entity;

import com.example.umc10th.global.enums.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "location")
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Address address;

    @OneToMany(mappedBy = "location", cascade = CascadeType.REMOVE)
    @Builder.Default
    private List<Store> storeList = new ArrayList<>();
}
