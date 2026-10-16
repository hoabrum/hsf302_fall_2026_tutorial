package com.springboot.controller;

import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        //Validate duplicate email
        //if email is duplicate -> show message
        // else save user
        if(userService.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already in use");
        }
        userService.save(user);
        return "index";
    }
}
