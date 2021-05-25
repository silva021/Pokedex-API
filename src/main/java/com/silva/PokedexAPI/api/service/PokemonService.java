package com.silva.PokedexAPI.api.service;

import com.silva.PokedexAPI.api.model.pokemon.PokemonDTO;
import com.silva.PokedexAPI.api.repository.PokemonRepository;
import com.silva.PokedexAPI.api.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository repository;

    public Optional<List<PokemonDTO>> getAllPokemon(int page) {
        return repository.getAllPokemon(Utils.getPageFromMySql(page)).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<PokemonDTO> findPokemonById(String id) {
        return repository.getPokemonById(id).map(PokemonDTO::new);
    }

    public Optional<List<PokemonDTO>> findPokemonByName(String name, int page) {
        return repository.getPokemonByName(name,Utils.getPageFromMySql(page)).map(pokemon -> pokemon.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<List<PokemonDTO>> getAllPokemonByGeneration(int generation, int page) {
        return repository.getAllPokemonByGeneration(generation, Utils.getPageFromMySql(page)).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

    public Optional<List<PokemonDTO>> findPokemonByType(String type, int page) {
        return repository.findPokemonByType(type, Utils.getPageFromMySql(page)).map(pokemons -> pokemons.stream().map(PokemonDTO::new).collect(Collectors.toList()));
    }

}
