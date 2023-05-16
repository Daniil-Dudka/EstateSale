package com.example.saler.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_property")
    private Long id;
    @Column (name = "address")
    private String address;
    @Column (name = "square")
    private long square;


    public Property() {
    }

    public Property(Long id, String address, long square) {
        this.id = id;
        this.address = address;
        this.square = square;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSquare() {
        return square;
    }

    public void setSquare(long square) {
        if(square > 0)
            this.square = square;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "id_type", referencedColumnName = "id_type")
    private Type type;

    @OneToMany (mappedBy = "property", cascade = CascadeType.ALL)
    private List<Advertisement> advertisements;


}

