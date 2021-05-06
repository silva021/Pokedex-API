package com.silva.PokedexAPI.api.model.pokemon;

import javax.persistence.*;

public class PokemonDTO {

    private int id;
    private String name;
    private String urlImage;
    private String type1;
    private String type2;
    private int generation;
    private int legendary;
    private AbilitiesDTO abilities;

    public PokemonDTO(Pokemon pokemon) {
        this.id = pokemon.getId();
        this.name = pokemon.getName();
        this.urlImage = pokemon.getUrlImage();
        this.type1 = pokemon.getType1();
        this.type2 = pokemon.getType2();
        this.generation = pokemon.getGeneration();
        this.legendary = pokemon.getLegendary();
        this.abilities = new AbilitiesDTO(pokemon.getAbilities());
    }
}
