package com.silva.PokedexAPI.api.controller;

import com.silva.PokedexAPI.api.model.pokemon.Pokemon;
import com.silva.PokedexAPI.api.model.pokemon.PokemonDTO;
import com.silva.PokedexAPI.api.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
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
    private PokemonRepository repository;

    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity findPokemonById(@PathVariable(name = "id") String id) {
        ResponseEntity<Object> response;
        Optional<Pokemon> pokemon = repository.getPokemonById(id);
        response = pokemon.<ResponseEntity<Object>>map(object -> ResponseEntity.ok(object)).orElseGet(() -> ResponseEntity.notFound().build());
        return response;
    }

    //Anotação que definir que neste diretorio ele irá fazer GET
    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<List<Pokemon>> findPokemonByName(@PathVariable(name = "name") String name) {
        ResponseEntity<List<Pokemon>> responseEntity;
        Optional<List<Pokemon>> optionalPokemons = repository.getPokemonByName(name);
        responseEntity = optionalPokemons.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
        return responseEntity;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> getAllPokemon() {
        ResponseEntity<List<PokemonDTO>> responseEntity;
        Optional<List<Pokemon>> optionalPokemons = repository.getAllPokemon();
        responseEntity = optionalPokemons.map(value -> new ResponseEntity<>(value.stream().map(PokemonDTO::new).collect(Collectors.toList()), HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
        return responseEntity;
    }

    @RequestMapping(value = "/generation/{generation}", method = RequestMethod.GET)
    public ResponseEntity<List<PokemonDTO>> getAllPokemonByGeneration(@PathVariable(name = "generation") int generation) {
        return repository.getAllPokemonByGeneration(generation).map(pokemons -> new ResponseEntity<>(pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()), HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(null, HttpStatus.NOT_FOUND));
    }
}
