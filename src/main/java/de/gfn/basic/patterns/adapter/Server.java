package de.gfn.basic.patterns.adapter;

import java.time.LocalDateTime;

public class Server {

    public Server() {
        System.out.println(LocalDateTime.now() + ": Server läuft");
    }

    public void send(Message message) {
        System.out.println(LocalDateTime.now() + ": Nachricht wird verschickt.");
        message.compute();
    }
}
