package com.example.Ecommerce_API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

//    @ManyToMany
//    @JoinTable(name = "fk_order_product_table", joinColumns = @JoinColumn(name="fk_order_id"),inverseJoinColumns = @JoinColumn(name = "fk_Product_id"))
//    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "fk_product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    private Integer productQuantity;


}
