package org.example.lesson6_homework;

public class NewDog extends NewAnimal {
    private static final int RUNLIMIT = 500;
    private static final int SWIMLIMIT = 10;
    private static int count = 1;
    private int dogNum;

    public NewDog(String name) {
        super(name);
        this.dogNum = this.count++;
    }

    @Override
    public void run(int length) {
        super.printRunResult("Dog", dogNum, name, length, RUNLIMIT);
    }

    @Override
    public void swim(int length) {
        super.printSwimResult("Dog", dogNum, name, length, SWIMLIMIT);
    }
}
