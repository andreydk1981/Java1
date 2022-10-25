package org.example.lesson6;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    protected String getColor() {
        return color;
    }

    protected void setColor(String color) {
        this.color = color;
    }

    @Override
    protected void voice() {
        System.out.println("Miaaaauuuuu");
    }
}

