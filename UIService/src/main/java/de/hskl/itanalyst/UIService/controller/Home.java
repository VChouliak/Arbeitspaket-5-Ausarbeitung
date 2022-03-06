package de.hskl.itanalyst.UIService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home {
    @GetMapping("/ui")
    public String index() {
        return "index";
    }
}
