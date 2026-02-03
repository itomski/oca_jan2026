package de.gfn.basic;

public class Konstruktoren {

    public static void main(String[] args) {

        Person person = new Person();
        //person.firstName = "Peter"; // Schreiben
        //person.lastName = "Parker";
        //person.age = 25;
        Person person1 = new Person("Peter", "Parker", 25);
        Person person2 = new Person("Bruce", "Banner");

        //person1.firstName = null;
        person1.setFirstName("Natasha");
        person1.setFirstName(null);
        System.out.println(person1.getFirstName().toUpperCase()); // Lesen

    }
}

class Person {

    private String firstName = "";
    private String lastName = "";
    private int age;

    // Wenn kein Konstruktor vorhanden ist, wird ein default Konstruktor bereitgestellt
    public Person() { // Erzeugt ein leeres Objekt
        // super(); // wird auto,matich aufgerufen
    }

    public Person(String firstName, String lastName, int age) {
        // this.firstName = Instanzeigenschaft
        // firstName = Parameter (lokale Variable)
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        if(firstName != null)
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName != null)
            this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
