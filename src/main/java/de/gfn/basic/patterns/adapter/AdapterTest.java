package de.gfn.basic.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        Server server = new Server();

        EMail eMail = new EMail("p.parker@shield.org", "b.banner@shield.org", "Cap. America", "Cap. America hat eine zu enge Hose...");
        server.send(eMail);

        Sms sms = new Sms("123456789", "7890123456", "Bla bla bla bla bla. Bla bla bla bla blablabla.");
        server.send(sms);

        Posting posting = new Posting("P.Parker", "Super Heros", "Superkräfte richtig einsetzen", ".....", "#heros", "#super", "#shield");
        // Der Adapter wird dazwischen gesteckt
        server.send(new PostingToMessageAdapter(posting));
    }
}
