package com.example.jenkins_test_1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {

    @GetMapping("/")
    public String getPage(){
        return "home";
    }
    
}
