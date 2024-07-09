package org.naman;

import java.beans.ConstructorProperties;

public class Alien {

    int age;
    private Laptop lap;

    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Laptop lap) {
        this.age = age;
        this.lap = lap;
    }

    public Alien(int age){
        System.out.println("Alien Constructor Called");
        this.age = age;
        System.out.println("Alien Object Created");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code() {
        System.out.println("Coding...");
        lap.compile();
    }
}
