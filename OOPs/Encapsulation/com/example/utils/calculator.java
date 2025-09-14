package OOPs.Encapsulation.com.example.utils;

import OOPs.Encapsulation.com.example.geometry.circle;
import OOPs.Encapsulation.com.example.geometry.rectangle;

public class calculator {
    public static void main(String[] args) {
        circle Circle = new circle(4.5);
        rectangle Rectangle = new rectangle(3, 7);
        double circlearea = Math.PI * Circle.radius * Circle.radius;
        double Rectarea = Rectangle.length * Rectangle.breadth;

        System.out.println(circlearea);
        System.out.println(Rectarea);
    }
}