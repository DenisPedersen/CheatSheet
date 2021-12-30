package com.company;

import java.util.Scanner;  //husk at importere util for Scanner!

import Inheritance.Guitar1;
import Objects.Person;

import static Loops.ForLoopsExamples.*;

public class Main {

    public static void main(String[] args) {
        countTo100();
        countTo100ButOnlyPrintEven();
        countTo100ButOnlyPrintOdd();
        Person person1 = new Person("John", 10, "Tøs");
        System.out.println("" + person1.name);

        String line = "";
        Scanner in = new Scanner(System.in);   //scanneren System.in fortæller at der skal hentes data ind udefra (her keyboardet).
       // System.out.println("Hello again, "+ line);
       // line = in.nextLine();

        Guitar1 g1 = new Guitar1();
           g1.pickup("Loud noise", "Gibson", "Flying V");
           // nu kan man via dot-syntaks benytte Guitarens parametre og funktioner selv uden at de er i Guitar1-klassen,
           // da extends er brugt. De har "arvet" egenskaberne.


    }
}