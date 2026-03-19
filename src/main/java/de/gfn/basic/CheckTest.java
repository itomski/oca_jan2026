package de.gfn.basic;

public class CheckTest {

    public static void main(String[] args) {

        boolean b = false;
        String str;

        if(b = true) {
            str = "A";
        }

        //String str2 = b? str : "false";

        //System.out.println(str);

        Boolean b1 = Boolean.valueOf(true);
        b1 = Boolean.valueOf("TruE");
        b1 = Boolean.parseBoolean("True");

        Integer i = Integer.valueOf(10);

    }
}
