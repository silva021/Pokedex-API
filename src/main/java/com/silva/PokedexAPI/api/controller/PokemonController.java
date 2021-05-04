package com.silva.PokedexAPI.api.controller;

import com.silva.PokedexAPI.api.model.Pokemon;
import com.silva.PokedexAPI.api.repository.PokemonRepository;
import com.silva.PokedexAPI.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationEventLocator;
import java.util.List;
import java.util.Optional;

// Anotação que indica que essa classe faz parte do web service
@RestController

// Anotação que indica que a esse web service estara mapeado nesse diretorio
@RequestMapping("/Pokemon/")
public class PokemonController {
    // Anotação para fazer a injeção de dependencia automaticamente
    @Autowired
    private PokemonRepository repository;
    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Optional<Pokemon> findPokemonById(@PathVariable(name = "id") String id) {
        return repository.getPokemonById(id);
    }

    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Optional<List<Pokemon>>  findPokemonByName(@PathVariable(name = "name") String name) {
        return repository.getPokemonByName(name);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Optional<List<Pokemon>> getAllPokemon(){
        return repository.getAllPokemon();
    }
}
