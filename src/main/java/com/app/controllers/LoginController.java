package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login(Model model) {
        return "login";
    }


    @RequestMapping("/loginError")
    public String loginError(Model model) {

        model.addAttribute("loginError", true);
        return "login.html";
    }
}
