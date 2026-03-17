package de.gfn.basic.annotations.validator;

public class Validator {

    public static boolean validate(Object o) throws Exception {

        boolean isValid = true;

        var c = o.getClass(); // Holt die Klassenbeschreibung

        for(var field : c.getDeclaredFields()) {
            field.setAccessible(true); // private Felder lesbar machen

            Object fieldValue = field.get(o);

            for(var anno : field.getAnnotations()) {
            }


            if(field.isAnnotationPresent(NotNull.class)) {
                if(fieldValue == null) {
                    isValid = false;
                    var annotation = field.getAnnotation(NotNull.class);
                    System.out.println(annotation.msg());
                }
            }
            if(field.isAnnotationPresent(MinLength.class)) {
                var annotation = field.getAnnotation(MinLength.class);
                if(fieldValue != null) {
                    if(fieldValue.toString().length() < annotation.value()) {
                        isValid = false;
                        System.out.println(annotation.msg());
                    }
                }
                else {
                    isValid = false;
                    System.out.println(annotation.msg());
                }
            }
            if(field.isAnnotationPresent(MaxLength.class)) {
                var annotation = field.getAnnotation(MaxLength.class);
                if(fieldValue != null) {
                    if(fieldValue.toString().length() > annotation.value()) {
                        isValid = false;
                        System.out.println(annotation.msg());
                    }
                }
                else {
                    isValid = false;
                    System.out.println(annotation.msg());
                }
            }
        }
        return isValid;
    }
}
