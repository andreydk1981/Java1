package org.example.lesson7_home;

public class Plate {
    private int capacity;
    public static final int ERROR = -1;
    private int amountOfFood = ERROR;

    public Plate(int amountOfFood, int capacity) {
        this.amountOfFood = amountOfFood;
        this.capacity = capacity;
    }

    public int getAmountOfFood() {
        return this.amountOfFood;
    }

    protected void setAmountOfFood(int amountOfFood) {
        if (checkCapacity(amountOfFood)) {
            this.amountOfFood = amountOfFood;
        } else {
            this.amountOfFood = ERROR;
        }
    }
    protected void putFood(int amountOfFood) {
        if (checkCapacity(amountOfFood)) {
            this.amountOfFood = amountOfFood;
            System.out.println("-------Plate filled with " + this.amountOfFood);
        } else {
            this.amountOfFood = ERROR;
        }
    }

    private boolean checkCapacity(int amountOfFood){
        if (amountOfFood < 0) System.out.println("-> Amount of food must be more than zero!");
        if (amountOfFood > capacity) System.out.printf("-> Amount of food more than plate capacity!\n");
        return amountOfFood >= 0 && capacity >= amountOfFood;
    }

    public int getCapacity (){
        return capacity;
    }

}
