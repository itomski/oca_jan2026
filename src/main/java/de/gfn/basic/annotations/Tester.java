package de.gfn.basic.annotations;

public class Tester {

    public static void main(String[] args) {

        AnnoObj obj = new AnnoObj();
        try {
            runTest(obj);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void runTest(Object obj) throws Exception {
        for(var method : obj.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(Test.class)) {
                var annotation = method.getAnnotation(Test.class);
                System.out.println("---------------------");
                System.out.println("RUN: " + annotation.title());
                if(annotation.run()) {
                    method.invoke(obj, 10);
                }
                else {
                    System.out.println("abgebrochen!");
                }
                System.out.println("---------------------\n");
            }
        }
    }
}
