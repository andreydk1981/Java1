package org.example.lesson6;

public class SiamCat extends Cat{
    private int shapesOfGray;

    public SiamCat(String name, String color, int shapesOfGray) {
        super(name, color);
        this.shapesOfGray = shapesOfGray;
    }

    public int getShapesOfGray() {
        return shapesOfGray;
    }

    public void setShapesOfGray(int shapesOfGray) {
        this.shapesOfGray = shapesOfGray;
    }

    @Override
    public void voice() {
        System.out.println("LOUD MIAU");
    }
}
