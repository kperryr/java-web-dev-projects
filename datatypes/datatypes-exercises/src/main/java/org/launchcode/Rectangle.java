package org.launchcode;
import java.util.Scanner;


public class Rectangle {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Hello, give a length");
        int length =input1.nextInt();
        Scanner input2 = new Scanner(System.in);

        System.out.println("Hello, give a width");
        int width =input2.nextInt();


        System.out.println("Hello the area of your rectangle is " + length*width);
    }
}
