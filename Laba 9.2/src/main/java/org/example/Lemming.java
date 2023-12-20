package org.example;
@Table(title = "LEMMING")
public class Lemming {
    public enum HairColor{
        RED, BLUE, WHITE
    }
    public Lemming(String name, int age, HairColor haircolor) {
        this.name = name;
        this.age = age;
        this.haircolor = haircolor;
    }

    @Column
    public String name;

    @Column
    public int age;

    @Column
    public HairColor haircolor;

}
