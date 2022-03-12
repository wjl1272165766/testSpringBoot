package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {


    @RequestMapping("/gotolog")
    public String fun(){
        System.out.println("Hello git5!!!");
        return "log";
    }

}
