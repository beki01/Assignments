package com.ss.mar.jb.two;

public class Circle implements Shape{
    double radius, totalArea, pi = Math.PI;

    /**
     * if called with no parameters sets radius equal to 1
     */
    public Circle(){
        this(1);
    }

    /**
     * Takes 1 parameter and sets radius
     * @param radius - radius of circle
     */
    public Circle(double radius){
        this.radius=radius;
    }

    /**
     * Calculates Area of Circle
     */
    @Override
    public void calculateArea() {
        this.totalArea = pi*(Math.pow(radius,2));
    }

    /**
     * Displays properties of Circle
     */
    @Override
    public void display() {
        this.calculateArea();
        System.out.println("Calculated Area of Circle is: "+ this.totalArea);
        System.out.println("Calculated radius of Circle is: "+ this.radius);
    }
}
