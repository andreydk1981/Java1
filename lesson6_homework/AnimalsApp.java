package org.example.lesson6_homework;

public class AnimalsApp {
    public static void main(String[] args) {
        NewCat newCat = new NewCat("Murzik");
        NewCat newCat2 = new NewCat("Kotik");
        NewCat newCat3 = new NewCat("Vasya");
        NewCat newCat4 = new NewCat("BArsik");
        NewCat newCat5 = new NewCat("Tom");
        NewDog newDog1 = new NewDog("Muhtar");
        NewDog newDog2 = new NewDog("RAM");
        NewDog newDog3 = new NewDog("Dina");
        NewDog newDog4 = new NewDog("Star");
        newCat.swim(-10);
        newCat5.swim(10);
        newCat2.run(100);
        newCat2.voice();
        newCat3.run(300);
        newCat4.run(200);
        newDog1.run(200);
        newDog2.run(500);
        newDog3.run(600);
        newDog3.swim(600);
        newDog4.swim(10);
        newDog4.swim(5);

        NewAnimal animal = new NewCat("Animal Cat");
        animal.run(89);
        ((NewCat)animal).voice();
    }
}
