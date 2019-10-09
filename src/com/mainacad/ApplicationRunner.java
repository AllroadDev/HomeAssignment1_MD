package com.mainacad;

import com.mainacad.Circle.Circle;
import com.mainacad.Square.Square;
import com.mainacad.Triangle.Triangle;
import com.mainacad.abs.Shape;

public class ApplicationRunner {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();

//        Square square = new Square();
//        square.setSide(10.0);
////        square.setName(" Square ");
//
//
//        System.out.println(" Square with side " + square.getSide() + " has area " + square.getArea() );
//
//        Circle circle = new Circle();
//        circle.setRadius(14.0);
//
//        System.out.println(" Circle with radius " + circle.getRadius() + " has area " + circle.getArea());
    }
}
