package models;

public abstract class Equipment extends Item {
    private boolean requiresAttunement;
    private boolean isMagical;
    public Equipment(String name, int price, int weight, boolean requiresAttunement, boolean isMagical) {
        super(name, price, weight);
        this.requiresAttunement = requiresAttunement;
        this.isMagical = isMagical;
    }


    public boolean isRequiresAttunement() {
        return requiresAttunement;
    }

    public void setRequiresAttunement(boolean requiresAttunement) {
        this.requiresAttunement = requiresAttunement;
    }

    public boolean isMagical() {
        return isMagical;
    }

    public void setMagical(boolean magical) {
        isMagical = magical;
    }

    public abstract void equip();


}
