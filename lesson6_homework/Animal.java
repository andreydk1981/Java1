package org.example.lesson6_homework;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    private boolean validateLimit(int limit, int length) {
        return (limit > 0 && length <= limit);
    }

    protected void printRunResult(String type, int number, String name, int length, int limit){
        if (validateLimit(limit,length)) {
            System.out.println(type +" #"+ number + " "+ name + " runs "+ length);
        } else System.out.println(type +" #"+ number + " "+ name + " cant run "+ length + " limit(" + limit +")");
    }
    protected void printSwimResult(String type, int number, String name, int length, int limit){
        if (validateLimit(limit,length)) {
            System.out.println(type +" #"+ number + " "+ name + " swam "+ length);
        } else System.out.println(type +" #"+ number + " "+ name + " cant swim "+ length + " limit(" + limit +")");
    }
}
