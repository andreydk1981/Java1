package org.example.lesson7_home;

import java.io.Console;
import java.util.Scanner;

public class AppCats {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vasya", 30);
        Cat cat2 = new Cat("Murka", 35);
        Cat cat3 = new Cat("Kotya", 40);
        Cat cat4 = new Cat("Manya", 15);
        Plate plate = new Plate(0, 200);
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Put food on the plate capacity %d:\n", plate.getCapacity());
            plate.putFood(scanner.nextInt());
        } while (plate.getAmountOfFood() == plate.ERROR);


        Cat[] catsArr = new Cat[]{cat1, cat2, cat3, cat4};
        for (int i = 0; i < catsArr.length; i++) {
            catsArr[i].eat(plate);
        }
        for (Cat cat : catsArr) {
            cat.info();
        }

        plate.putFood(100);

        for (int i = 0; i < catsArr.length; i++) {
            catsArr[i].eat(plate);
        }
        for (Cat cat : catsArr) {
            cat.info();
        }

    }
}
