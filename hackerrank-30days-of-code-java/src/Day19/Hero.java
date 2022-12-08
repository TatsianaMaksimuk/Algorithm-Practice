package Day19;

public class Hero implements Character {
    public String weapon = "Force";

    public String getWeapon(){
        return weapon;
    }
    @Override
    public void attack() {
        System.out.println("Hero attacks");
    }

    @Override
    public void heal() {
        System.out.println("Hero heals");
    }
}
