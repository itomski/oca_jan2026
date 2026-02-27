package de.gfn.basic.sql;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class AppTest {

    public static void main(String[] args) {

        Repository<Person> repo;

        try {
            repo = new PersonRepository();

//            Person person = new Person("Peter", "Parker", LocalDate.of(1999, 4, 10));
//            if(repo.save(person)) {
//                System.out.println("Erfolgreich gespeichert.");
//            }


            Optional<Person> opt = repo.find(1);
            if(opt.isPresent()) {
                Person p = opt.get();
                p.setFirstname("Bruce");
                p.setLastname("Banner");
                repo.save(p);
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
