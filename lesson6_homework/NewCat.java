package org.example.lesson6_homework;

public class NewCat extends NewAnimal {
    private static final int RUNLIMIT = 200;
    private static final int SWIMLIMIT = 0;
    private static int count = 1;
    private int catNum;

    public NewCat(String name) {
        super(name);
        this.catNum = this.count++;
    }

    @Override
    public void run(int length) {
        super.printRunResult("Cat", catNum, name, length, RUNLIMIT);
    }

    @Override
    public void swim(int length) {
        super.printSwimResult("Cat", catNum, name, length, SWIMLIMIT);
    }

    public void voice() {
        System.out.println("Cat #" + catNum + " " + name + " Say MIAAAAAUUUU!!!!!");
    }
}
