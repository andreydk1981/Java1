package org.example.lesson6;

public class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void voice() {
        System.out.println("Animal speak something");
    }
}
