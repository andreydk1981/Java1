package org.example.lesson7_home;

public class Cat {
    private String name;
    private int appetite;
    private boolean  isFool = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if (!isFool) System.out.print(name + " Start Eating. ");
        if (isFool) {
            System.out.println(name +" don't want to eat");
        } else if (plate.getAmountOfFood() < appetite) {
            System.out.println("There's not much food left in the plate for " + name);
        } else {
            plate.setAmountOfFood(plate.getAmountOfFood()-appetite);
            System.out.printf("%s ate %d food from the plate and there are %d left\n", name, appetite, plate.getAmountOfFood());
            isFool = true;
        }
    }

    public void info(){
        System.out.printf("Cat %s is %s\n", name, isFool? "fool": "hungry");
    }
}
