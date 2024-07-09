package org.com;

 public class Square extends Figure {

    private int a = 1;
    private int b = 2;

      public void calculateArea() {
            double square_area = a*b;
            System.out.println("square area is: " + square_area);
    }
}

