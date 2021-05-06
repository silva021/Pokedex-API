package com.silva.PokedexAPI.api.model.pokemon;

import javax.persistence.*;

@Entity
@Table(name = "t_Abilities")
public class Abilities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pokemon")
    private int id;
    @Column(name = "total")
    private int total;
    @Column(name = "hp")
    private int  hp;
    @Column(name = "attack")
    private int  attack;
    @Column(name = "defense")
    private int  defense;
    @Column(name = "sp_atack")
    private int spkAttack;
    @Column(name = "sp_defense")
    private int spkDefense;
    @Column(name = "speed")
    private int speed;

    public Abilities(int id, int total, int hp, int attack, int defense, int spkAttack, int spkDefense, int speed) {
        this.id = id;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spkAttack = spkAttack;
        this.spkDefense = spkDefense;
        this.speed = speed;
    }

    public Abilities() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpkAttack() {
        return spkAttack;
    }

    public void setSpkAttack(int spkAttack) {
        this.spkAttack = spkAttack;
    }

    public int getSpkDefense() {
        return spkDefense;
    }

    public void setSpkDefense(int spkDefense) {
        this.spkDefense = spkDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
