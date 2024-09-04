package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page handler");
        // sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("CompanyName", "Remiges PVT LTD");
        model.addAttribute("companylink", "https://remiges.tech/");
        return "home";
    }

    // About Page Route
    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("About Page ");
        return "about";
    }

    // services route
    @RequestMapping("/services")
    public String servicesPage() {
        return new String("services");
    }

    // Contact route
    @GetMapping("/contact")
    public String contactPage() {
        return new String("contact");
    }

    // Login route
    @GetMapping("/login")
    public String loginPage() {
        return new String("login");
    }

    // Register route
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }

}
