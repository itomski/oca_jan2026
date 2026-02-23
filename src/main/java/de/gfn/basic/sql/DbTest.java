package de.gfn.basic.sql;

import java.sql.*;

public class DbTest {

    public static void main(String[] args) {

        final String URL = "jdbc:sqlite:data.db";

        try(Connection con = DriverManager.getConnection(URL);
                            Statement stmt = con.createStatement()) {

            // Tabelle erzeugen
//            final String sql = "CREATE TABLE IF NOT EXISTS personen (" +
//                                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
//                                    "firstname TEXT NOT NULL, " +
//                                    "lastname TEXT NOT NULL, " +
//                                    "birthdate DATE NOT NULL" +
//                                ")";
//            stmt.execute(sql);
//            System.out.println("Erfolgreich gebaut!");

            // Datensatz hinzufügen
//            final String SQL = "INSERT INTO personen (id, firstname, lastname, birthdate) " +
//                                    "VALUES(null, 'Bruce', 'Banner', '1982-05-10')";
//
//            if(stmt.executeUpdate(SQL) > 0) {
//                System.out.println("Erfolgreich gespeichert!");
//            }

            // Daten abfragen
            final String SQL = "SELECT * FROM personen";

            ResultSet results = stmt.executeQuery(SQL);

            while(results.next()) {
                System.out.print(results.getInt("id") + ": ");
                System.out.print(results.getString("firstname") + " ");
                System.out.print(results.getString("lastname") + " ");
                System.out.print(results.getString("birthdate"));
                System.out.println();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
