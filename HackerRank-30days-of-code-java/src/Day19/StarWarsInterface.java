package Day19;

import java.util.Random;

public class StarWarsInterface {
    public static Character summonCharacter(){
        Random random = new Random();
        if (Math.abs(random.nextInt())%2 == 0){
            return new Enemy();
        }else {
            return new Hero();
        }
    }

    public static void main(String[] args) {
        Enemy vader = new Enemy();
        Hero obiWan = new Hero();
        vader.attack();
        obiWan.attack();
        vader.heal();
        obiWan.heal();
        System.out.println("Enemy weapon: " + vader.getWeapon());
        System.out.println("Hero weapon: " + obiWan.getWeapon());

        Character spy = summonCharacter(); //instantiated hero randomly we don't know if its hero or enemy
        spy.attack();
        spy.heal();
    }
}
