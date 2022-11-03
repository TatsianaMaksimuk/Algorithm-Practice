package Day19;

public class Enemy implements Character{
    //signatures of methods should match interface's methods

    public String weapon = "Lightsaber";

    //Constructor:
    public Enemy(){

    }

    public String getWeapon(){
        return weapon;
    }

    public void attack(){
        System.out.println("Enemy attacks");
    }

    @Override //not obligatory, because in Interface it's abstract and does not have implementation
    public void heal(){
        System.out.println("Enemy heals");
    }

    public void weaponDraw(){
        System.out.println("draw out weapon");
    }
}
