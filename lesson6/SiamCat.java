package org.example.lesson6;

public class SiamCat extends Cat{
    private int shapesOfGray;

    public SiamCat(String name, String color, int shapesOfGray) {
        super(name, color);
        this.shapesOfGray = shapesOfGray;
    }

    protected int getShapesOfGray() {
        return shapesOfGray;
    }

    protected void setShapesOfGray(int shapesOfGray) {
        this.shapesOfGray = shapesOfGray;
    }

    @Override
    protected void voice() {
        System.out.println("LOUD MIAU");
    }
}
