package org.example.lesson6_homework;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat newCat = new Cat("Murzik");
        Cat newCat2 = new Cat("Kotik");
        Cat newCat3 = new Cat("Vasya");
        Cat newCat4 = new Cat("BArsik");
        Cat newCat5 = new Cat("Tom");
        Dog newDog1 = new Dog("Muhtar");
        Dog newDog2 = new Dog("RAM");
        Dog newDog3 = new Dog("Dina");
        Dog newDog4 = new Dog("Star");
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

        Animal animal = new Cat("Animal Cat");
        
        animal.run(89);
        ((Cat)animal).voice();
    }
}
