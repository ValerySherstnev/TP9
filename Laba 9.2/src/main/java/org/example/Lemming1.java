package org.example;

import java.time.LocalDate;
import java.util.Date;

@Table(title = "LEMMING1")
public class Lemming1 {
    public enum HairColor{
        RED, BLUE, WHITE
    }
    public Lemming1(String name, int age,HairColor haircolor, Date date) {
        this.name = name;
        this.age = age;
        this.haircolor = haircolor;
        this.date = date;
    }

    @Column
    public String name;
    @Column
    public Date date;
    @Column
    public int age;
    @Column
    public HairColor haircolor;

}
