package Inheritance;

public class Guitar3 extends Guitar {  //key-wordet "extends" gør, at Guitar1-klassen også indeholder de samme funktioner og variabler som Guitar-klassen.
    String manufacturer = "Gibson";
    String model = "Flying V   ";
    int serialNumber = 89004;
    String color = "Green";


    public static void pickup() {
        System.out.println("Loud noise!");
    }
    public static void volumeKnob() {
        System.out.println("This goes to 11111!");
    }
}
