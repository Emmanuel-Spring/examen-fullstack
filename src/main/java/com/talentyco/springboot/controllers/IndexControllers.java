package com.talentyco.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexControllers {


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String  index() {

        return "index";
}

    @RequestMapping(value = "/ver", method = RequestMethod.GET)
    public String  ver() {

        return "ver";
    }
}