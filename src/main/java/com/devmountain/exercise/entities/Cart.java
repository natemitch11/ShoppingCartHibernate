package com.devmountain.exercise.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cart_name", nullable = false, length = 50)
    private String name;

    @OneToMany(mappedBy = "cart")
    List<Product> products = new ArrayList<>();

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

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Cart(String name) {
        this.name = name;
    }

    public Cart() {
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),getProducts(),getName());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (!(obj instanceof Cart cart)) return false;

        return Objects.equals(getId(), cart.getId()) && Objects.equals(getName(), cart.getName());
    }

    @Override
    public String toString() {
        return String.format("Cart Name: %s \nProducts: %s", getName(), getProducts());
    }
}
