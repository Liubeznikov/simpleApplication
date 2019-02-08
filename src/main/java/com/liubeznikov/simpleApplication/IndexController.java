package com.liubeznikov.simpleApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class IndexController {

    @GetMapping("/welcome")
    public String contr() {
       return "welcome";
    }
}
