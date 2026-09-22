package com.example.simpleWebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.Model.Product;
import com.example.simpleWebApp.Service.ProductService;

@RestController 
public class ProductController {
    
    @Autowired 
    ProductService service;

    @GetMapping("/product")
    public List<Product> getProduct() {
        return service.getProducts();
    }

    @GetMapping("/product/{prodID}")
    public Product getProductByID(@PathVariable int prodID) {
        return service.getProductsByID(prodID);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/product") 
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodID}")
    public void deleteProduct(@PathVariable int prodID) {
        service.deleteProduct(prodID);
    }
}
