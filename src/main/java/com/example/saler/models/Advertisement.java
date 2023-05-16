package com.example.saler.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "advertisement")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ad")
    private Long id;
    @Column (name = "typeRole")
    private String typeRole;
    @Column (name = "price")
    private long price;
    @Column (name = "description", columnDefinition = "text")
    private String description;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "id_property", referencedColumnName = "id_property")
    private Property property;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "id_user", referencedColumnName = "id_user")
    private User user;
}
