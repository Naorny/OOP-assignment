package org.com;

public class Triangle extends Figure {
    private double n;
    private double h;

    public Triangle(String name, double x, double y, double n, double h) {
        super(name, x, y);
        this.n = n;
        this.h = h;
    }
    @Override
   public double calculateArea(){
        return n*h/2;
    }
}
