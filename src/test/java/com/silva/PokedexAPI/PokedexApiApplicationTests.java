package com.silva.PokedexAPI;

import com.silva.PokedexAPI.api.model.pokemon.PokemonDTO;
import com.silva.PokedexAPI.api.service.PokemonService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class PokedexApiApplicationTests {

	@Autowired
	PokemonService pokemonService;


	@Test
	public void findPokemonById() {
		pokemonService.findPokemonById("1421412");
	}

	@Test
	public void findPokemonByName() {
		pokemonService.findPokemonByName("Lucario", 1);
	}

	@Test
	public void getAllPokemon() {
		pokemonService.getAllPokemon(1);
	}

	@Test
	public void getAllPokemonByGeneration() {
		pokemonService.getAllPokemonByGeneration(1, 2);
	}
}
