package Encapsulation;

public class Main {
    public static void main(String[] args) {


        Student s = new Student(); //laver et nyt Student-objekt
        s.setName("John"); //bruger setName til at sætte navnet til John
        s.setAge(12);
        System.out.println(s.getName()); //printer navn
        System.out.println(s.getAge());  //og alder
    }
}
