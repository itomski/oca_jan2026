package de.gfn.basic.sql;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {

        Repository<Person> repo;

        try {
            repo = new PersonRepository();

            Person person = new Person("Carol", "Danvers", LocalDate.of(1988, 5, 18));
            if(repo.save(person)) {
                System.out.println("Erfolgreich gespeichert.");
            }

//            if(repo.insert(person)) {
//                System.out.println("Erfolgreich gespeichert.");
//            }

//            List<Person> personen = repo.find();

            for(Person p : repo.find()) {
                System.out.println(p.getId() + ": " + p.getFirstname() + " " + p.getLastname() + ", " + p.getBirthdate());
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
