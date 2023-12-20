package org.example;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) throws Exception {
        Lemming[] lemmings = {
                new Lemming("Космос", 9, Lemming.HairColor.WHITE),
                new Lemming("Саша", 9, Lemming.HairColor.WHITE),
                new Lemming("Пчёла", 14, Lemming.HairColor.RED),
        };
        Lemming1 lemming1 = new Lemming1("Саша", 5, Lemming1.HairColor.WHITE, new Date(2023-1900,8,12));
        Lemming1 lemming2 = new Lemming1("Дима", 3, Lemming1.HairColor.WHITE, new Date(2012-1900,5,23));
        Annotation.createTable(lemming1);
        Annotation.insertIntoTable(lemming1);
        Annotation.insertIntoTable(lemming2);

        Annotation.createTable(lemmings[0]);
        for (Lemming lemming: lemmings) {
            Annotation.insertIntoTable(lemming);
        }

        System.out.println(LocalDate.now());


    }
}