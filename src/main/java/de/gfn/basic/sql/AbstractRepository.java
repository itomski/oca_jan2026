package de.gfn.basic.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRepository<T extends AbstractEntity> implements Repository<T> {

    // Finale Attribute müssen spätestens im Konstruktor gesetzt werden
    final protected String TABLE;

    public AbstractRepository(String TABLE) {
        this.TABLE = TABLE;
    }

    protected boolean executeSqlQuery(final String sql) throws SQLException {
        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {
            return stmt.execute(sql);
        }
    }

    public List<T> find(String SQL) throws SQLException {

        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {

            List<T> list = new ArrayList<>();
            ResultSet rs = stmt.executeQuery(SQL);
            while(rs.next()) {
                list.add(create(rs));
            }
            return list;
        }
    }

    @Override
    public boolean delete(T t) throws SQLException {
        return delete(t.getId());
    }

    @Override
    public boolean delete(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {
            return stmt.executeUpdate(SQL) == 1;
        }
    }

}
