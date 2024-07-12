package org.com;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double x, double y, double radius) {
        super(name, x, y);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}
