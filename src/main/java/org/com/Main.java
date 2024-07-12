package org.com;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[10];
        Random rand = new Random();

        for (int i = 0; i < figures.length; i++) {
            int figure = rand.nextInt(3);
            double x = rand.nextDouble() * 10;
            double y = rand.nextDouble() * 10;
            switch (figure) {
                case 0:
                    figures[i] = new Circle("Circle", x, y, rand.nextDouble() * 10);
                case 1:
                    figures[i] = new Triangle("Triangle", x, y, rand.nextDouble() * 10, rand.nextDouble() * 10);
                case 2:
                    figures[i] = new Square("Square", x, y, rand.nextDouble() * 10);
                    break;
            }

        }

        int n = figures.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (figures[j].calculateArea() > figures[j + 1].calculateArea()) {
                    Figure type = figures[j];
                    figures[j] = figures[j + 1];
                    figures[j + 1] = type;
                }
            }
        }


        System.out.println("Sorted array by ASC: ");
        for (int i = 0; i < figures.length; i++) {
            Figure figure = figures[i];
            System.out.println(figure);
        }
    }
}
