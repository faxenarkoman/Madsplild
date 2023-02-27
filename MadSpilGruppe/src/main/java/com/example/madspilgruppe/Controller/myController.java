package com.example.madspilgruppe.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class myController
{

    @GetMapping("/home")
    public String showHomePage()
    {
        return "home";
    }

}
