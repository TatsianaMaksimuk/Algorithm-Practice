package models.consumables;

import models.Consumable;

public class Scroll extends Consumable {


    private String spell;


    public Scroll(String name, int price, int weight, String spell) {
        super(name, price, weight);
        this.spell = spell;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }


    @Override
    public void consume() {
        System.out.println("You cast " + this.spell);
    }


}
