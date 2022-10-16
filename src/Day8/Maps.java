package Day8;

import java.util.HashMap;
import java.util.Map;

public class Maps {


    Map <String, String> phoneBook = new HashMap<>();


    public void dataInput(String input){
        String name = "";
        String phoneNumber = "";
        String split[];
        split= input.split(" ");
        if(split.length>=1){
            name = split[0];
            phoneNumber = split[1];
        } else {
            name = split[0];
        }

        phoneBook.put(name,phoneNumber);


        System.out.println(name + " " + phoneNumber);
    }

    public void keyPrint(){
        System.out.println(phoneBook.keySet()
        );
    }


    public void search(String name){
        if(phoneBook.containsKey(name)){
            System.out.println(name+"="+phoneBook.get(name));
        } else{
            System.out.println("Not found");
        }
    }
}
