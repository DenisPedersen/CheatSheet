package Inheritance;

public class Guitar2 extends Guitar{  //key-wordet "extends" gør, at Guitar1-klassen også indeholder de samme funktioner og variabler som Guitar-klassen.
    String manufacturer = "Fender";
    String model = "Telecaster";
    int serialNumber = 7;
    String color = "White";

    public static void pickup() {
        System.out.println("Loud noise!");
    }
    public static void volumeKnob() {
        System.out.println("This goes to 100!");
    }

}
