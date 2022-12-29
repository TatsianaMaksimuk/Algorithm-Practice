package models.consumables;

import models.Consumable;

public class Potion extends Consumable {

    private String effect;


    public Potion(String name, int price, int weight, String effect) {
        super(name, price, weight);
        this.effect = effect;
    }


    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }


    @Override
    public void consume() {
        System.out.println("You receive " + this.effect);
    }
}
