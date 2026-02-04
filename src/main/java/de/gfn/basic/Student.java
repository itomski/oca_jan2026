package de.gfn.basic;

public class Student {

    private final String firstName;
    private final String lastName;
    private final int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    @Override
    public String toString() { // Konvertierung von Student in String
        return firstName + ' ' + lastName + ',' + age;
    }
}
