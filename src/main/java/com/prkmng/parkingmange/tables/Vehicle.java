package com.prkmng.parkingmange.tables;


import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name="vehicle_tbl")
@EnableJpaAuditing
public class Vehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    @NotNull
    @Column(name = "CarTag",unique = true)
    private String carTag;

    @NotNull
    @Column(name = "CarType")
    @Enumerated(value = EnumType.STRING)
    private CarType carType;

}
