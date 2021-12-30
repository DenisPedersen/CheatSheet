package Stacks;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {


        Stack<String> cutlery = new Stack<String>(); //laver en ny Stack (som er et array af Strings her).

        cutlery.add("fork");
        cutlery.add("spoon");   //tilføjer via dot-syntaks til bestikket
        cutlery.add("knife");

        System.out.println(cutlery); //printer hele Stacken
        System.out.println(cutlery.pop()); //printer det som er øverst i stacken (blevet tilføjet sidst)
        System.out.println(cutlery); //printer hele Stacken, men nu mangler "knife", fordi det er blevet "popped" af stacken (taget af).
        System.out.println(cutlery.peek()); // viser det som er øverst i stacken, men fjerner det ikke fra stacken.
        System.out.println(cutlery.contains("fork")); //kigger efter om der er fork i arrayet vha en boolean
        System.out.println(cutlery.contains("knife")); // kigger efter om der er knife i arrayet (den er jo fjernet).
        System.out.println(cutlery.get(1)); //index (kigger efter hvad der er på indekset plads (1 her)
        System.out.println(cutlery.set(0, "knife")); //erstatter hvad der er på den 0'e plads med en kniv.
        //System.out.println(cutlery.push("Knife"); //tilføjer til stacken
        System.out.println(cutlery.size()); //printer størrelsen på Stacken
    }
}
