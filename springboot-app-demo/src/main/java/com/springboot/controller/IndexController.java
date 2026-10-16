package com.springboot.controller;

import com.springboot.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/demo")
public class IndexController  {

    @Autowired
    private UserService userService;

    @GetMapping
    public String index(HttpServletRequest request) {
        String param = request.getParameter("param");
        System.out.println(param);
        return "index";
    }
}
