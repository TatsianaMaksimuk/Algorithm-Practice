package models;

public abstract class Consumable extends Item {

    public Consumable(String name, int price, int weight) {
        super(name, price, weight);
    }

    public abstract void consume();
}
