package com.example.notWeb;

import org.springframework.stereotype.Component;

@Component 
public class Desktop implements Computer {
    
    public void compile() {
        System.out.println("Compiling right now but faster");
    }
}
