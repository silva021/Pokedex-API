package com.silva.PokedexAPI.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotação que indica que essa classe faz parte do web service
@RestController

// Anotação que indica que a esse web service estara mapeado nesse diretorio
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String welcome(){
        return "Seja bem vindo";
    }
}
