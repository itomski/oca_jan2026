package de.gfn.basic.sql;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {

        Repository<Person> repo;

        try {
            repo = new PersonRepository();

//            Person p = new Person("Bruce", "Banner", LocalDate.of(1985, 1, 10));
//            if(repo.insert(p)) {
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
