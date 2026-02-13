package de.gfn.basic.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesTest {

    public static void main(String[] args) {

        //System.out.println(System.getProperties());
        final String USER_DIR = System.getProperty("user.home"); // Benutzerordner

        Properties props = new Properties();
//        props.put("user", "admin");
//        props.put("password", "geheim");
//        props.put("port", "3306");

        //writeToProperties(USER_DIR, props);
        //writeToXml(USER_DIR, props);

        readFromXml(USER_DIR, props);
        System.out.println(props);
        System.out.println(props.getOrDefault("user", "Unbekannt"));
    }

    private static void writeToProperties(String dir, Properties props) {
        try(OutputStream out = new FileOutputStream(dir + "/config.properties")) {
            props.store(out, null);
            System.out.println("Successfully stored config.properties");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void writeToXml(String dir, Properties props) {
        try(OutputStream out = new FileOutputStream(dir + "/config.xml")) {
            props.storeToXML(out, null);
            System.out.println("Successfully stored config.xml");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readFromXml(final String dir, Properties props) {
        try(InputStream in = new FileInputStream(dir + "/config.xml")) {
            props.loadFromXML(in); // Lädt die Datten aus der Datei in das Objekt
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
