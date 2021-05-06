package com.silva.PokedexAPI.api.model.pokemon;

public class AbilitiesDTO {

    private int total;
    private int hp;
    private int attack;
    private int defense;
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

    public AbilitiesDTO() {
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

    public AbilitiesDTO(int total, int hp, int attack, int defense, int spkAttack, int spkDefense, int speed) {
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spkAttack = spkAttack;
        this.spkDefense = spkDefense;
        this.speed = speed;
    }
}
