package com.ss.mar.jb.two;

public class Rectangle implements Shape{
    double width, length, totalArea;

    /**
     * if called with no parameters sets width & length equal to 1
     */
    public Rectangle(){
        this(1, 1);
    }

    /**
     * Takes 2 parameters when instance is created.
     * @param width - width of Rectangle
     * @param length - length of Rectangle
     */
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }

    /**
     * Calculates Area of Rectangle
     */
    @Override
    public void calculateArea() {
        this.totalArea = width*length;
    }

    /**
     * Displays properties of Rectangle
     */
    @Override
    public void display() {
        this.calculateArea();
        System.out.println("Calculated Area of Rectangle is: "+ this.totalArea);
        System.out.println("Width of Rectangle is: "+ this.width);
        System.out.println("Length of Rectangle is: "+ this.length);
    }
}
