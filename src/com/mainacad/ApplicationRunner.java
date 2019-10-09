package com.mainacad;

import com.mainacad.Circle.Circle;
import com.mainacad.Square.Square;
import com.mainacad.Triangle.Triangle;
import com.mainacad.abs.Shape;

public class ApplicationRunner {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setBase(13.5);
        triangle.setHeights(10.0);

        Circle circle = new Circle();
        circle.setRadius(7.5);

        Square square = new Square();
        square.setSide(45.0);

        Shape maxShape;
        Shape minShape;

        if (circle.getArea() > square.getArea()) {
        maxShape = circle;

        } else {
            maxShape = square;
        }
        if (maxShape.getArea() < triangle.getArea()) {
            maxShape = triangle;
        }
        System.out.println(" Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());


        if (circle.getArea() > square.getArea()) {
            minShape = circle;

        } else {
            minShape = square;
        }

        if (minShape.getArea() > triangle.getArea()) {
            minShape = triangle;

        }
        System.out.println(" Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea() );

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
