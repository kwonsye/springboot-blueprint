package com.springboot.blueprint.domain_name_pkg.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class DomainIndexController {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("modelName", "blueprint-model-ex");

        return "index";
    }
}
