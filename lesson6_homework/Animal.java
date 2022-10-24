package org.example.lesson6_homework;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void run(int length);
    public abstract void swim(int length);
}
