package de.gfn.basic.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioTest {

    public static void main(String[] args) {

        // NIO & NIO2

        Path path = Paths.get("data.txt");
        try {
            // Liest alle Zeilen in eine List ein (alles landet im Speicher)
            List<String> zeilen = Files.readAllLines(path);
            for(String zeile : zeilen) {
                System.out.println(zeile);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("-------------");

        try {
            // Liest Zeile für Zeile (nur die aktuelle Zeile liegt im Speicher)
            Files.lines(path)
                    .forEach(z -> System.out.println(z));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
