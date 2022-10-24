package org.example.lesson6_homework;

public class NewCat extends Animal {
    private static int count = 1;
    private final int RUNLIMIT = 200;
    private int catNum;
    public NewCat(String name) {
        super(name);
        catNum = this.count++;
    }

    @Override
    public void run(int length) {
        if (length <= RUNLIMIT) {
            System.out.println("Cat #"+ catNum + " "+ name + " runs "+ length);
        } else System.out.println("Cat #"+ catNum + " "+ name + " cant run "+ length + " limit(" + RUNLIMIT +")");

    }

    @Override
    public void swim(int length) {
        System.out.println("Cat #"+ catNum + " "+ name + " I cant swim...");

    }

    public void voice(){
        System.out.println("Cat #"+ catNum + " "+ name + " MIAAAAAUUUU!!!!!");
    }
}
