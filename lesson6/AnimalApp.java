package org.example.lesson6;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Somebody");
        Cat cat = new Cat("Murka", "Black");
        Dog dog = new Dog("Muhtar", "Simple dog");

        System.out.println("Animal name = " + animal.getName());
        System.out.println("Cat name = " + cat.getName());
        System.out.println("Dog name = " + dog.getName());

        animal.voice();
        cat.voice();
        dog.voice();
        System.out.println("--------------");
        SiamCat siamCat = new SiamCat("SC", "Grey", 50);

        Animal someAnimal = new Cat("Vasya","Fire");
        Animal someAnimal2 = new SiamCat("Simka","grey", 33);
        Animal someAnimald = new Dog("REM","Ovcharka");

        Animal [] animals = new Animal[] {someAnimal, someAnimal2, someAnimald};
        for (Animal a : animals) {
            if (a instanceof Dog){
                System.out.println("This dog breed is " + ((Dog)a).getBreed());
            }
            System.out.println(a.getName());
            a.voice();
        }
    }
}
