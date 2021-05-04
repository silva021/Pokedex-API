package com.silva.PokedexAPI.api.model;

import javax.persistence.*;

@Entity
public class Pokemon {

    @Id
    @Column(name = "codigo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int codigo;

    @Column(name = "id")
    String id;
    @Column(name = "name")
    String name;
    @Column(name = "url_image")
    String urlImage;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Pokemon() {
    }

    public Pokemon(int codigo, String id, String name, String urlImage) {
        this.codigo = codigo;
        this.id = id;
        this.name = name;
        this.urlImage = urlImage;
    }
}
