package org.example.lesson6_homework;

class NewCat extends NewAnimal {
    private static int count = 1;
    private final int RUNLIMIT = 200;
    private static final int SWIMLIMIT = 0;
    private int catNum;
    public NewCat(String name) {
        super(name);
        catNum = this.count++;
    }

    @Override
    public void run(int length) {
        printRunResult("Cat", catNum,name,length,RUNLIMIT);

    }

    @Override
    public void swim(int length) {
        printSwimResult("Cat", catNum,name,length,SWIMLIMIT);

    }

    public void voice(){
        System.out.println("Cat #"+ catNum + " "+ name + " MIAAAAAUUUU!!!!!");
    }
}
