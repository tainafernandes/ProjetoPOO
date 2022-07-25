package entitites;

import entitites.enums.Color;

public abstract class Shape {

    public Shape(){
        //empty constructor
    }

    public Shape(Color color) {
        this.color = color;
    }

    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

}
