package ArrayList;

import Objects.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortArrayListOfObjects {

    public static void main(String[] args) {

        ArrayList<Person> newPersonList = new ArrayList<>(); //laver en arraylist af objektet "Person" fra min Person-klasse.
        Scanner stringInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);

        String sName;
        int iAge;
        String sGender;
        int iCount;

        for (iCount = 0; iCount <5; iCount++) {
            System.out.println("Skriv navnet på personen her ");
            sName = stringInput.nextLine();
            System.out.println("Skriv alderen på personen her: ");
            iAge = intInput.nextInt();
            System.out.println("Skriv kønnet på personen her: ");
            sGender = stringInput.nextLine();

            newPersonList.add(new Person(sName, iAge, sGender));

            System.out.println("\n");
            Collections.sort(newPersonList, new Comparator<Person>() { //bruger collectionsklassen til at sortere personerne efter.
                //stigende sortering
                @Override
                public int compare(Person o1, Person o2) {
                    return Integer.valueOf(o2.getAge()).compareTo(o1.getAge());
                }
            });

            for (iCount = 0 ; iCount <newPersonList.size(); iCount++) {
                System.out.println("Personens navn " + newPersonList.get(iCount).getName() +
                        ", alder " + newPersonList.get(iCount).getAge());
            }
        }

    }

}
