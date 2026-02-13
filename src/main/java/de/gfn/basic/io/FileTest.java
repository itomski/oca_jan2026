package de.gfn.basic.io;

import de.gfn.basic.collections.Person;

import java.io.*;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("data.txt");
        BufferedReader br = null;
        try {
            // Byteweise
//            FileInputStream fis = new FileInputStream(file);
//            BufferedInputStream bis = new BufferedInputStream(fis);

            // Zeichenweise
            br = new BufferedReader(new FileReader(file));

            String str;
            while((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Datei nicht verfügbar.");
        }
        catch (IOException e) {
            System.out.println("Problem beim Lesen.");
        }
        finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("-------------");

        file = new File("data.txt");

        // try-with-ressources
        try(BufferedReader r = new BufferedReader(new FileReader(file))) {

            String str;
            while((str = r.readLine()) != null) {
                System.out.println(str);
            }
            // alle geöffneten Ressourcen werden automatisch geschlossen
        }
        catch (FileNotFoundException e) {
            System.out.println("Datei nicht verfügbar.");
        }
        catch (IOException e) {
            System.out.println("Problem beim Lesen.");
        }

        // try- with-ressources kommt auch ohne catch und finally aus
        // try(Person p = new Person()) {} // Error: Person ist nicht AutoClosable

    }
}
