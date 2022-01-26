package com.devmountain.solution;

import com.devmountain.exercise.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class CartSolution {
    private List<Product> cart = new ArrayList<>();

    public List<Product> getCart() {
        return cart;
    }

    public void addToCart(Product product){
        cart.add(product);
    }

    public void removeFromCart(String name){
        cart.removeIf(p -> p.getName().equals(name));
    }

    public Double cartTotal(){
        Double total = 0D;
        for (Product p : cart){
            total+= p.getPrice();
        }
        return qualifyForDiscount(total);
    }

    public void discountMessage(Double total){
        if (total >= 1500){
            System.out.println("Congrats you get a Discount");
        } else{
            System.out.println("No Discount Applied");
        }
    }

    private Double qualifyForDiscount(Double total){
        discountMessage(total);
        if (total >= 1500 ){
            return total * 0.8;
        }
        return total;
    }
}
