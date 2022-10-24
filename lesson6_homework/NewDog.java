package org.example.lesson6_homework;

public class NewDog extends NewAnimal {
    private static int count = 1;
    private final int RUNLIMIT = 500;
    private final int SWIMLIMIT = 10;
    private int swimLimit = 10;
    private int dogNum;

    public NewDog(String name) {
        super(name);
        this.dogNum = count++;
    }

    @Override
    public void run(int length) {
        if (length <= RUNLIMIT) {
            System.out.println("Dog #"+ dogNum + " "+ name + " runs "+ length);
        } else System.out.println("Dog #"+ dogNum + " "+ name + " cant run "+ length + " limit(" + RUNLIMIT +")");

    }

    @Override
    public void swim(int length) {
        if (length <= SWIMLIMIT) {
            System.out.println("Dog #"+ dogNum + " "+ name + " swam "+ length);
        } else System.out.println("Dog #"+ dogNum + " "+ name + " cant swim "+ length + " limit(" + SWIMLIMIT +")");


    }
}
