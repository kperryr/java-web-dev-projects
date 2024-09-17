package org.launchcode;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Hello, please enter the miles you have driven");
        double miles =input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Hello, please enter the amount of gallons used");
        double gallon =input2.nextInt();


        System.out.println("Hello your mpg is " + miles/gallon + "mpg.");
    }
}
