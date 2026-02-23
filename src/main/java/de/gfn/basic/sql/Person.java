package de.gfn.basic.sql;

import java.time.LocalDate;

// POJO - Plain Old Java Object
public class Person extends AbstractEntity {

    private String firstname;
    private String lastname;
    private LocalDate birthdate;

    public Person() {
    }

    public Person(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }

    public Person(int id, String firstname, String lastname, LocalDate birthdate) {
        this(firstname, lastname, birthdate);
        setId(id);
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    // TODO: toString, equals, hashCode implementieren
}
