package de.gfn.basic.sql;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository extends AbstractRepository<Person> {

    private final String TABLE = "personen";

    public PersonRepository() throws SQLException {
        createTable();
    }

    @Override
    public boolean insert(Person person) throws SQLException {

        // TODO: auf PreparedStatements umstellen
        final String SQL_TPL = "INSERT INTO " + TABLE + " (id, firstname, lastname, birthdate) VALUES(null, '%s', '%s', '%s')";

        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {
            final String SQL = String.format(SQL_TPL, person.getFirstname(), person.getLastname(), person.getBirthdate());
            return stmt.executeUpdate(SQL) > 0;
        }
    }

    @Override
    public boolean update(Person person) throws SQLException {
        throw new UnsupportedOperationException("Ist noch nicht implementiert!");
    }

    @Override
    public Optional<Person> find(int id) throws SQLException {
        throw new UnsupportedOperationException("Ist noch nicht implementiert!");
    }

    @Override
    public List<Person> find() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {

            List<Person> personen = new ArrayList<>();

            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()) {
                personen.add(create(rs));
            }

            return personen;
        }
    }

    @Override
    public boolean delete(Person person) throws SQLException {
        return delete(person.getId());
    }

    @Override
    public boolean delete(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {
            return stmt.executeUpdate(SQL) == 1;
        }
    }

    @Override
    public Person create(ResultSet rs) throws SQLException {

        Person person = new Person();
        person.setId(rs.getInt("id"));
        person.setFirstname(rs.getString("firstname"));
        person.setLastname(rs.getString("lastname"));
        //person.setBirthdate(rs.getDate("birthdate").toLocalDate());
        person.setBirthdate(LocalDate.parse(rs.getString("birthdate")));
        return person;
    }

    @Override
    public boolean createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                                "firstname TEXT NOT NULL, " +
                                "lastname TEXT NOT NULL, " +
                                "birthdate DATE NOT NULL)";

        return executeSqlQuery(SQL);
    }
}
