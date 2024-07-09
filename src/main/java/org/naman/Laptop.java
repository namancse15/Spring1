package org.naman;

public class Laptop {

    private String name;
    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter Called in 'Laptop' -> 'name'");
        this.name = name;
    }

    public void compile(){
        System.out.println("Compile...");
    }
}
