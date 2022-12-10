package Day28.User;

import java.util.HashSet;
import java.util.Set;

public class User {
    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUsername, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUsername;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }


    public static void main(String[] args) {

        Set a = new HashSet<>(); //set is an interface
        a.add(1212);
        User Helga = new User("Helga", "password", 16, a);

    }
}
