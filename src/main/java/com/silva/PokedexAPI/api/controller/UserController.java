package com.silva.PokedexAPI.api.controller;

import com.silva.PokedexAPI.api.model.User.User;
import com.silva.PokedexAPI.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public ResponseEntity<User> getUser() {
        return null;
    }

}
