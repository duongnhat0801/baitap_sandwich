package com.codegym.baitap_sandwich_condiments.controller.controller;

import com.codegym.baitap_sandwich_condiments.controller.model.Sandwich;
import com.codegym.baitap_sandwich_condiments.controller.service.ISanWichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "sandwich")
public class SandwichController {

    @Autowired
    private ISanWichService sandwichService;

    @GetMapping
    public String showMenu(Model model){
        List<Sandwich> items = sandwichService.getAll();
        model.addAttribute("items", items);
        return "/home";
    }

    @PostMapping("/listMenu")
    public String save(@RequestParam(value = "condiment", required = false) String[] condiment, Model model) {
        if (condiment == null) {
            return "redirect: /sandwich";
        }
        for (int i = 0; i < condiment.length; i++) {
            model.addAttribute("item"+i, condiment[i]);
        }
        return "/list";
    }
}

