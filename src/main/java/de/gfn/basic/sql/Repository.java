package de.gfn.basic.sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Repository<T extends AbstractEntity> {

    // CRUD - Create, Read, Update, Delete

    boolean insert(T t) throws SQLException;

    boolean update(T t) throws SQLException;

    Optional<T> find(int id) throws SQLException; // Einen Datensatz abfragen

    List<T> find() throws SQLException; // Alle Datensätze abfragen

    boolean delete(T t) throws SQLException;

    boolean delete(int id) throws SQLException;

    // Wandelt die relationalen Daten des ResultSets in Objekte um
    T create(ResultSet rs) throws SQLException;

    boolean createTable() throws SQLException;
}
