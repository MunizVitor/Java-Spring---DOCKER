package com.dockerAndJava.dockerJavaSpring.domain;

import jakarta.persistence.*;
import org.hibernate.service.spi.InjectService;

import java.util.UUID;

@Entity
@Table(name = "tb_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
