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

    public PokemonDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public int getLegendary() {
        return legendary;
    }

    public void setLegendary(int legendary) {
        this.legendary = legendary;
    }

    public AbilitiesDTO getAbilities() {
        return abilities;
    }

    public void setAbilities(AbilitiesDTO abilities) {
        this.abilities = abilities;
    }
}
