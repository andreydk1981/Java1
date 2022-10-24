package org.example.lesson6_homework;

public class AnimalsApp {
    public static void main(String[] args) {
        NewCat newCat = new NewCat("Murzik");
        NewCat newCat2 = new NewCat("Kotik");
        NewCat newCat3 = new NewCat("Vasya");
        NewCat newCat4 = new NewCat("BArsik");
        NewCat newCat5 = new NewCat("Tom");
        Dog dog1 = new Dog("Muhtar");
        Dog dog2 = new Dog("Muhtar");
        Dog dog3 = new Dog("Muhtar");
        Dog dog4 = new Dog("Muhtar");
        newCat.swim(10);
        newCat5.swim(10);
        newCat2.run(100);
        newCat2.voice();
        newCat3.run(300);
        newCat4.run(200);
        dog1.run(200);
        dog2.run(500);
        dog3.run(600);
        dog3.swim(600);
        dog4.swim(10);
        dog4.swim(5);

        Animal animal = new NewCat("Animal Cat");
        animal.run(89);
        ((NewCat)animal).voice();
    }
}
