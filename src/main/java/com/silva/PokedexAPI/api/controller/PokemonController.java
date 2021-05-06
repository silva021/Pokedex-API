package com.silva.PokedexAPI.api.controller;

import com.silva.PokedexAPI.api.model.pokemon.Pokemon;
import com.silva.PokedexAPI.api.model.pokemon.PokemonDTO;
import com.silva.PokedexAPI.api.repository.PokemonRepository;
import com.silva.PokedexAPI.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

// Anotação que indica que essa classe faz parte do web service
@RestController

// Anotação que indica que a esse web service estara mapeado nesse diretorio
@RequestMapping("/api/pokemon/")
public class PokemonController {
    // Anotação para fazer a injeção de dependencia automaticamente
    @Autowired
    private PokemonService service;

    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> findPokemonById(@PathVariable(name = "id") String id) {
        return service.findPokemonById(id).<ResponseEntity<Object>>map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> findPokemonByName(@PathVariable(name = "name") String name, @RequestParam(value = "page", defaultValue = "1") int page) {
        return service.findPokemonByName(name, page).map(pokemonDTOS -> new ResponseEntity<>(pokemonDTOS, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> getAllPokemon(@RequestParam(value = "page", defaultValue = "1") int page) {
        return service.getAllPokemon(page).map(pokemons -> new ResponseEntity<>(pokemons, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }

    @RequestMapping(value = "/generation/{generation}", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> getAllPokemonByGeneration(@PathVariable(name = "generation") int generation, @RequestParam(value = "page", defaultValue = "1") int page) {
        return service.getAllPokemonByGeneration(generation, page).map(pokemons -> new ResponseEntity<>(pokemons, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}
