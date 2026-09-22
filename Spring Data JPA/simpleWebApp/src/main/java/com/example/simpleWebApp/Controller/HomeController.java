package com.example.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController 
// @Controller 
public class HomeController {
    
    @RequestMapping("/")
    // @ResponseBody 
    public String homePage() {
        return "Hi, I am on the HomePage";
    }
    
    @RequestMapping("/about")
    public String about() {
        return "Hi, I am on the AboutPage";
    }

}
