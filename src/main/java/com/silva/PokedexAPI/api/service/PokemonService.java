package com.silva.PokedexAPI.api.service;

import com.silva.PokedexAPI.api.model.pokemon.Pokemon;
import com.silva.PokedexAPI.api.model.pokemon.PokemonDTO;
import com.silva.PokedexAPI.api.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.netty.NettyWebServer;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository repository;

    public Optional<List<PokemonDTO>> getAllPokemon(int page) {
        return repository.getAllPokemon(page).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<PokemonDTO> findPokemonById(String id) {
        return repository.getPokemonById(id).map(PokemonDTO::new);
    }

    public Optional<List<PokemonDTO>> findPokemonByName(String name, int page) {
        return repository.getPokemonByName(name, page).map(pokemon -> pokemon.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<List<PokemonDTO>> getAllPokemonByGeneration(int generation, int page) {
        return repository.getAllPokemonByGeneration(generation, page).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<List<PokemonDTO>> findPokemonByType(String type, int page) {
        return repository.findPokemonByType(type, page).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

}
