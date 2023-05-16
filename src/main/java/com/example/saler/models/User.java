package com.example.saler.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id_user")
    private Long id;
    @Column (name = "first_name")
    private String first_name;
    @Column (name = "last_name")
    private String last_name;
    @Column (name = "email")
    private String email;
    @Column (name = "password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles",
            joinColumns = {@JoinColumn(name = "user", referencedColumnName = "id_user")},
            inverseJoinColumns = {@JoinColumn(name = "role", referencedColumnName = "id_role")})
    private List<Role> roles;



}
