package Day19;

public interface Character {
    public String base = "character"; //it's final and cannot be changed by classes

    public void attack();

    public void heal();

    public String getWeapon();


}
