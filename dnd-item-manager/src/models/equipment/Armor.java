package models.equipment;

import models.Equipment;

public class Armor extends Equipment {
    private int armorPoints;

    public Armor(String name, int price, int weight, boolean requiresAttunement, boolean isMagical, int armorPoints) {
        super(name, price, weight, requiresAttunement, isMagical);
        this.armorPoints = armorPoints;
    }


    public int getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(int armorPoints) {
        this.armorPoints = armorPoints;
    }


    @Override
    public void equip() {
        System.out.println("You put on " + this.getName() + ". You have + " + this.armorPoints + " AC.");
    }


}
