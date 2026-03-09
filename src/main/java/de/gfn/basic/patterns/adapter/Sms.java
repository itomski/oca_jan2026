package de.gfn.basic.patterns.adapter;

public class Sms implements Message {

    private final String fromNr;
    private final String toNr;
    private final String body;

    public final int BODY_MAX_LENGTH = 120;

    public Sms(String fromNr, String toNr, String body) {
        this.fromNr = fromNr;
        this.toNr = toNr;
        if(body.length() > BODY_MAX_LENGTH) {
            this.body = body.substring(0, BODY_MAX_LENGTH) + "...";
        }
        else {
            this.body = body;
        }
    }

    @Override
    public void compute() {
        System.out.println("-------------- SEND SMS --------------");
        System.out.println("-- START");
        System.out.println("-- FROM: \t" + fromNr);
        System.out.println("-- TO: \t\t" + toNr);
        System.out.println("-- BODY: \t" + body);
        System.out.println("-- END \n");
    }

}
