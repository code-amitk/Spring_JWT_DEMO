package com.jwt.example.controller;

import com.jwt.example.models.User;
import com.jwt.example.services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
@Slf4j
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> getUser() {
        System.out.println("get Users details ...");
        return this.userService.getUsers();
    }

    @RequestMapping("/current-user")
    public String getLoggedInUSer(Principal principal) {
      return principal.getName();

    }

    @RequestMapping("/test")
    public String test() {
        log.warn("This is working message");
        return "Testing message";
    }


}
