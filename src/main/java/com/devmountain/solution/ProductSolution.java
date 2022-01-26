package com.devmountain.solution;

public class ProductSolution {
    private String name;
    private Integer price;
    private Float weight;
    private Boolean isOrganic;

    public ProductSolution(String name, Integer price, Float weight, Boolean isOrganic) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.isOrganic = isOrganic;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Boolean getOrganic() {
        return isOrganic;
    }

    public void setOrganic(Boolean organic) {
        isOrganic = organic;
    }

    @Override
    public String toString() {
        return "Product: " + name + " Price: " + price;
    }
}
