package org.example.lesson6_homework;

public class Dog extends Animal {
    private static int count = 1;
    private static final int RUNLIMIT = 500;
    private static final int SWIMLIMIT = 10;
    private int swimLimit = 10;
    private int dogNum;

    public Dog(String name) {
        super(name);
        this.dogNum = count++;
    }

    @Override
    public void run(int length) {
        printRunResult("Dog", dogNum,name,length,RUNLIMIT);
    }

    @Override
    public void swim(int length) {
        printSwimResult("Dog", dogNum,name,length,SWIMLIMIT);
    }
}
