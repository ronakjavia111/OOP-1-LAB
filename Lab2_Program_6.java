package com.company;

import java.util.Scanner;

public class Lab2_Program_6{
    public static void main(String[] args) {
        double pound, weight, inch, height, bmi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Weight : ");
        weight = sc.nextDouble();
        pound = weight/(.45359237);
        System.out.println(weight+ " kg = " +pound+ " pound");

        System.out.print("Enter Height : ");
        height = sc.nextDouble();
        inch = height/(.0254);
        System.out.println(height+ " mt = " +inch+ " inch");

        bmi = weight/(height*height);
        System.out.println("Body Mass Index : "+bmi);
    }
}
