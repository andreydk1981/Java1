package org.example.lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name,  int age){
        this(name, "White", age);
    }

    public  Cat (){
        this("Stepan", "Grey", 5);
        System.out.println("This is new cat");
    }

    public String getName (){
        return this.name;
    }
    public String getColor (){
        return this.color;
    }
    public int getAge (){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
