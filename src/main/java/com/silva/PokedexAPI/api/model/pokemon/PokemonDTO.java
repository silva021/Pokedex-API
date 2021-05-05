package com.silva.PokedexAPI.api.model.pokemon;

public class PokemonDTO {

    private String name;
    private String urlImage;

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

    public PokemonDTO(Pokemon pokemon) {
        this.name = pokemon.getName();
        this.urlImage = pokemon.getUrlImage();
    }
}
