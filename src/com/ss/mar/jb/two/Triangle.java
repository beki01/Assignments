package com.ss.mar.jb.two;

public class Triangle implements Shape {
    double a, b, c, totalArea;

    /**
     * if called with no parameters sets all sides equal to 1
     */
    public Triangle(){
        this(1, 1, 1);
    }

    /**
     * Takes 3 parameters which are the three sides of a triangle
     * @param a - side A of triangle
     * @param b - side B of triangle
     * @param c - side C of triangle
     */
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    /**
     * Calculates Area of Triangle
     */
    @Override
    public void calculateArea() {
        double s = (a + b + c) / 2;
        this.totalArea = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Displays properties of Triangle
     */
    @Override
    public void display() {
        this.calculateArea();
        System.out.println("Calculated Area of Triangle is: "+ this.totalArea);
        System.out.println("Side A of Triangle is: "+ this.a);
        System.out.println("Side B of Triangle is: "+ this.b);
        System.out.println("Side C of Triangle is: "+ this.c);
    }
}
