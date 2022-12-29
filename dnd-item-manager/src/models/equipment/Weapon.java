package models.equipment;

import models.Equipment;

public class Weapon extends Equipment {
    private int damage;


    public Weapon(String name, int price, int weight, boolean requiresAttunement, boolean isMagical, int damage) {
        super(name, price, weight, requiresAttunement, isMagical);
        this.damage = damage;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


    @Override
    public void equip() {
        System.out.println("You equipped " + this.getName());
    }

    public void attack() {
        System.out.println("You attack an enemy with " + this.getName() + ". Roll " + damage + ".");
    }
}
