package Objects;

public class Person {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private int age;
    private String gender;
    public Person(String name, int age, String gender) {  //konstruktøren
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Denne person hedder " + name + " og er " + age + " år gammel. Det er en " + gender);
    }
}
