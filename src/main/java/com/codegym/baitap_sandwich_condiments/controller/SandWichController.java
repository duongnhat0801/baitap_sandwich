package com.codegym.baitap_sandwich_condiments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandWichController {

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@RequestParam("condiment") String[] condiment) {
        for (String c : condiment) {
            System.out.println(c);
        }
        return "result";
    }
}

