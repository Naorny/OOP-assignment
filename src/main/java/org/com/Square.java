package org.com;

public class Square extends Figure {
    private double a;

     public Square(String name, double x, double y, double a) {
         super(name, x, y);
         this.a = a;
     }
     @Override
     public double calculateArea() {
         double pow = Math.pow(a, 2);
         return pow;
     }
}

