package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> supermarketQueue = new LinkedList<String>(); //ny kø som består af Strings. Husk LinkedList

        supermarketQueue.add("John"); //tilføjer Strings til køen
        supermarketQueue.add("Thobias");
        supermarketQueue.add("Arne");
        supermarketQueue.add("Bjarne");
        supermarketQueue.add("Brian");


        System.out.println(supermarketQueue); //printer køen
        supermarketQueue.poll(); //fjerner forreste String fra køen
        System.out.println(supermarketQueue);
        supermarketQueue.poll(); //fjerner næste fra køen
        System.out.println();supermarketQueue.peek(); //ser forreste String i køen
        System.out.println(supermarketQueue);
        System.out.println(supermarketQueue.size()); // ser på størrelsen på køen
        System.out.println(supermarketQueue.contains("Arne")); //ser om Arne er i køen stadigvæk vha en boolean
        System.out.println(supermarketQueue.toArray()[1]); //converter til et array og printer det som er på plads 1.

    }
}
