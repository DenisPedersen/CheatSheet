package Inheritance;
//inheritance lader en "child"-klasse arve variabler og metoder fra en anden klasse (parent-Class).
// F.eks. kan en Dog-class (child-klassen) arve fra en Animal-class (parent-klassen).
//det her er den "generic" guitar, som de andre guitarer er bygget ud fra.
public class Guitar {

    String manufacturer;
    String model;
    int serialNumber;
    String color;


    public static void pickup(String noise, String manufacturer, String model) {
        System.out.println(noise + " from the " + manufacturer + " "+ model + ".");
    }
    public static void tuner() {
    }
    public static void volumeKnob() {
    }
}
