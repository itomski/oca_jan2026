package de.gfn.basic.annotations.validator;

public class Fahrzeug {

    @MinLength(8)
    @MaxLength(12)
    @NotNull
    private String kennzeichen;

    @MinLength(2)
    @MaxLength(20)
    @NotNull
    private String marke;

    @MinLength(2)
    @MaxLength(20)
    @NotNull
    private String modell;

    public Fahrzeug(String kennzeichen, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
    }

    public Fahrzeug() {
    }
}
