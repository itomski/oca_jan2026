package de.gfn.basic.exceptions;

public class EigeneExceptionTest {

    public static void main(String[] args) {

//        try {
//            System.out.println(checkAlter(15));
//        }
//        catch (RuntimeException e) {
//            System.out.println(e.getMessage());
//        }


        try {
            System.out.println(checkAlter(-120));
        }
        catch (AngabeUngueltigException e) {
            System.out.println("Angabe ist ungültig!");
        }
        catch (ZuJungException e) {
            System.out.println("Du bist zu jung.");
        }
    }

    private static boolean checkAlter(int alter) throws AngabeUngueltigException, ZuJungException {

//        if(alter < 0 || alter > 150) {
//            throw new RuntimeException("Ungültige Angabe");
//        }
//        else if(alter < 16) {
//            throw new RuntimeException("Du bist zu jung");
//        }
//        else {
//            return true;
//        }

        if(alter < 0 || alter > 150) {
            throw new AngabeUngueltigException();
        }
        else if(alter < 16) {
            throw new ZuJungException();
        }
        else {
            return true;
        }
    }
}

class ZuJungException extends Exception {
    public ZuJungException() {
        super("Zu Jung");
    }
}

class AngabeUngueltigException extends Exception {
    public AngabeUngueltigException() {
        super("Angabe ist ungültig");
    }
}
