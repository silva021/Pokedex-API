package com.silva.PokedexAPI.api.model.pokemon;

import javax.persistence.*;

@Entity
@Table(name = "t_Pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "url_image")
    private String urlImage;
    @Column(name = "type1")
    private String type1;
    @Column(name = "type2")
    private String type2;
    @Column(name = "generation")
    private int generation;
    @Column(name = "legendary")
    private int legendary;
    @ManyToOne
    @JoinColumn(name = "id_pokemon")
    private Abilities abilities;


    public Pokemon(int id, String name, String urlImage, String type1, String type2, int generation, int legendary, Abilities abilities) {
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
        this.type1 = type1;
        this.type2 = type2;
        this.generation = generation;
        this.legendary = legendary;
        this.abilities = abilities;
    }

    //    @ElementCollection
    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
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

    public Pokemon() {
    }


}
