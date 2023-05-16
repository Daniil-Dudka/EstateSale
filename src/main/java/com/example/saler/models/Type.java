package com.example.saler.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_type")
    private Long id;
    @Column (name = "typeName")
    private String typeName;


    @OneToOne(mappedBy = "type", cascade = CascadeType.ALL)
    private Property property;

}
