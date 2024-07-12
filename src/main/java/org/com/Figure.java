package org.com;

    public abstract class Figure {
        private  String name;
        private double x;
        private double y;

        public Figure(String name, double x, double y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }

        public abstract double calculateArea();

        @Override
        public String toString() {
             return  name + ", Area=" + calculateArea();
         }
    }

