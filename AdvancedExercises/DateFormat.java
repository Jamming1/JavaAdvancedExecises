package AdvancedExercises;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormat {
    public static void main(String[] args) {
        String dateString = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(dateString);
        System.out.println(dateTime);
        dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        System.out.println(dateTime);
        dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println(dateTime);
        dateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println(dateTime);
    }
}
//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni