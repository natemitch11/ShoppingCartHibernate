package com.devmountain.exercise.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_price", nullable = false)
    private Integer price;

    @ManyToOne
    Cart cart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product(String name, Integer price, Cart cart) {
        this.name = name;
        this.price = price;
        this.cart = cart;
    }

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return String.format("Name: %s Price: %s", getName(), getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getName(),getPrice(),getCart());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (!(obj instanceof Product cart)) return false;

        return Objects.equals(getId(), cart.getId()) && Objects.equals(getName(), cart.getName());
    }
}
