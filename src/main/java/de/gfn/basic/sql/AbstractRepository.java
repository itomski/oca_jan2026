package de.gfn.basic.sql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractRepository<T extends AbstractEntity> implements Repository<T> {


    protected boolean executeSqlQuery(final String sql) throws SQLException {
        try(Connection dbh = DbUtils.getConnection(); Statement stmt = dbh.createStatement()) {
            return stmt.execute(sql);
        }
    }

}
