package Encapsulation;
//Encapsulation gør det lettere for brugeren at se hvad
public class Student {  //her laves bare et student objekt
    private String name;
    private int age;
    public void setName(String newName) { //laver en setter for navn
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public int getAge() {
        return age;
    }
}
