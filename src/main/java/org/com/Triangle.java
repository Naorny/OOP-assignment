package org.com;


public class Triangle extends Figure {
    private int n = 2;
    private int h = 3;

    public void calculateArea(){
        double triangle_area = (double) n * h / 2;
        System.out.println("triangle area is: " + triangle_area);

}}
