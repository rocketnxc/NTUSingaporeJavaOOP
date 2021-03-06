package NTUSingapore.Exercise1;

import NTUSingapore.Exercise1.Circle;

/**
 * Created by Cao on 6/23/2015.
 */
public class TestCircle { // save as "TestCircle.java"
    public static void main(String[] args) {
// Declare and allocate an instance of class Circle called c1
// with default radius and color
        Circle c1 = new Circle();
// Use the dot operator to invoke methods of instance c1.
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
// Declare and allocate an instance of class circle called c2
// with the given radius and default color
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(); // construct an instance of Circle
        c3.setRadius(5.0); // change radius
        c3.setColor("RED"); // change color
// Use the dot operator to invoke methods of instance c2.
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and area of " + c2.getArea());
        System.out.println("The color" + c3.getColor());

    }

}
