package org.example.lesson6_homework;

public abstract class NewAnimal {
    protected String name;

    public NewAnimal(String name) {
        this.name = name;
    }
    public abstract void run(int length);
    public abstract void swim(int length);
}
