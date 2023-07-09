package com.example.Ecommerce_API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String landmark;

    private String phoneNumber;

    private String zipcode;

    private String state;

    @OneToOne
    @JoinColumn(name="fk_user_id")
    private User user;
}
