package com.example.saler.models;

import jakarta.persistence.*;
import lombok.Data;


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
    @Column (name = "price")
    private long price;
    @Column (name = "description", columnDefinition = "text")
    private String description;

    public Property() {
    }

    public Property(Long id, String address, long square, long price, String description) {
        this.id = id;
        this.address = address;
        this.square = square;
        this.price = price;
        this.description = description;
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

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        if(price > 0)
            this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}

