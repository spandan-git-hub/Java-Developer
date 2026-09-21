package com.example.simpleWebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.simpleWebApp.Model.Product;

@Service 
public class ProductService {
    
    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(101, "Iphone", 50000),
        new Product(102, "Charger", 10000000),
        new Product(103, "Apple", 10))
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductsByID(int prodID) {
        // return products.stream()
        //     .filter(p -> p.getProdId() == prodID)
        //     .findFirst().get();
        return products.stream()
                .filter(p -> p.getProdId() == prodID)
                .findFirst().orElse(new Product(100, "No Item", 0));
    }

    public void addProduct(Product prod) {
        // System.out.println(prod);
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int idx = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prod.getProdId()) idx = i;
        }
        products.set(idx, prod);
    }

    public void deleteProduct(int prodID) {
        int idx = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProdId() == prodID) idx = i;
        }
        products.remove(idx);
    }
}
