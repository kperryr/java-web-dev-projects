package org.launchcode;
import java.util.Scanner;
import java.lang.Math;
import org.launchcode.Circle;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");

        double radius = input.nextDouble();

        double area = Circle.getArea(radius);
        System.out.println("The area of your circle is " + area);

    }
}
