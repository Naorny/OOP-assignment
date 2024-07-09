package org.com;


public class Circle extends Figure {
    private int radius = 2;

    public void calculateArea() {
        double circle_area = Math.PI * (radius * radius);
        System.out.println("triangle area is: " + circle_area);


    }
}
