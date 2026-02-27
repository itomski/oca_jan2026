package de.gfn.basic.sql;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class PersonRepository extends AbstractRepository<Person> {

    public PersonRepository() throws SQLException {
        super("personen");
        createTable();
    }

    @Override
    public boolean insert(Person person) throws SQLException {

        final String SQL = "INSERT INTO " + TABLE + " (id, firstname, lastname, birthdate) VALUES(null, ?, ?, ?)";

        try(Connection dbh = DbUtils.getConnection(); PreparedStatement stmt = dbh.prepareStatement(SQL)) {
            stmt.setString(1, person.getFirstname());
            stmt.setString(2, person.getLastname());
            stmt.setString(3, person.getBirthdate().toString());
            stmt.execute();
            return stmt.getUpdateCount() > 0;
        }
    }

    @Override
    public boolean update(Person person) throws SQLException {
        final String SQL = "UPDATE " + TABLE + " SET firstname = ?, lastname = ?, birthdate = ? WHERE id = ?";

        try(Connection dbh = DbUtils.getConnection(); PreparedStatement stmt = dbh.prepareStatement(SQL)) {
            stmt.setString(1, person.getFirstname());
            stmt.setString(2, person.getLastname());
            stmt.setString(3, person.getBirthdate().toString());
            stmt.setInt(4, person.getId());
            stmt.execute();
            return stmt.getUpdateCount() > 0;
        }
    }

    @Override
    public Optional<Person> find(int id) throws SQLException {
        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;
        // Stream findFirst liefert ein Optional
        return find(SQL).stream().findFirst();
    }

    @Override
    public List<Person> find() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;
        return find(SQL);
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
