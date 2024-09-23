package com.example;

import com.example.model.Users;
import com.example.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")

public class UserController {
    private UsersService userService;
    @GetMapping("/login")
    public String login(@RequestBody Users users){
        return "public home";
    }
}
