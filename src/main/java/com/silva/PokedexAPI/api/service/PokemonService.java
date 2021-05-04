package com.silva.PokedexAPI.api.service;

import com.silva.PokedexAPI.api.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Anotação que defini que essa classe é um Service que pode ser injetavel
@Service
public class PokemonService {
    List<Pokemon> pokemons = new ArrayList<>();

    public PokemonService() {
        pokemons.add(new Pokemon(1, "#007", "Squirtle", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/007.png"));
        pokemons.add(new Pokemon(2, "#390", "Chimchar", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/390.png"));
        pokemons.add(new Pokemon(3, "#252", "Treecko", "https://assets.pokemon.com/assets/cms2/img/pokedex/full/252.png"));
    }

    public Pokemon getPokemonById(String id) {
        return pokemons.get(pokemons.indexOf(id));
    }

    public Pokemon getPokemonByName(String name) {
        return pokemons.get(pokemons.indexOf(name));
    }

    public List<Pokemon> getAllPokemon() {
        return pokemons;
    }
}
