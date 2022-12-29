import models.Item;
import models.consumables.Potion;
import models.consumables.Scroll;

public class Main {
    public static void main(String[] args) {
        Potion healingPotion = new Potion("Healing potion", 50, 1, "+ 10HP");
        Scroll fireballScroll = new Scroll("Fireball scroll", 100, 1, "Fireball");
        Item[] items = new Item[]{
                healingPotion,
                fireballScroll,
        };
        System.out.println("Your inventory:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getName());
        }

        fireballScroll.consume();
        healingPotion.consume();
    }
}