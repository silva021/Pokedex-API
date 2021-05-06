package com.silva.PokedexAPI.api.model.pokemon;

public class AbilitiesDTO {

    private int total;
    private int  hp;
    private int  attack;
    private int  defense;
    private int spkAttack;
    private int spkDefense;
    private int speed;

    public AbilitiesDTO(Abilities abilities) {
        this.total = abilities.getTotal();
        this.hp = abilities.getHp();
        this.attack = abilities.getAttack();
        this.defense = abilities.getDefense();
        this.spkAttack = abilities.getSpkAttack();
        this.spkDefense = abilities.getSpkDefense();
        this.speed = abilities.getSpeed();
    }
}
