package com.prkmng.parkingmange.tables;


import ch.qos.logback.classic.db.names.ColumnName;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Table(name = "parking_tbl")
@EnableJpaAuditing
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotNull
    @Column(name = "EnterTime")
   @Temporal(TemporalType.TIMESTAMP)
    private Date EnterTime;

    @NotNull
    @Column(name="OutTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date OutTime;

    @Column(name="PriceRate")
    private Long PriceRate;

    @Column(name = "Total")
    private Long Total;
}
