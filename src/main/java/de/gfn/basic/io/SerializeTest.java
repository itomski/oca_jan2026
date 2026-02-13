package de.gfn.basic.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

    private static final String SER_FILE = "personen.ser";


    public static void main(String[] args) {

//        List<Person> persons = new ArrayList<>();
//        persons.add(new Person("Peter", "Parker"));
//        persons.add(new Person("Carol", "Danvers"));
//        persons.add(new Person("Bruce", "Banner"));
//        persons.add(new Person("Natasha", "Romanov"));

        try {
            //saveToFile(persons);
            List<Person> persons = readFromFile();
            for (Person person : persons) {
                System.out.println(person);
            }
        }
        catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void saveToFile(List<Person> persons) throws IOException {

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SER_FILE))) {
            oos.writeObject(persons); // Alles wird serialisiert und gespeichert
        }
    }

    private static List<Person> readFromFile() throws IOException, ClassNotFoundException {

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SER_FILE))) {
            return (List<Person>) ois.readObject();
        }
    }
}
