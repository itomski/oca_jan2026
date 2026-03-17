package de.gfn.basic.annotations;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"geburtsdatum"})
public class Person {

    @Getter @Setter
    private String vorname;

    @Getter
    private String nachname;

    @Getter @Setter
    private LocalDate geburtsdatum;

}
