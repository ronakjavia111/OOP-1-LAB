package com.company;
import java.util.Scanner;

public class Lab2_Program_2 {
    public static void main(String[] args) {
        double Radius, Area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Circle : ");
        Radius = sc.nextFloat();

        Area = 3.14*Radius*Radius;
        System.out.println("Area = " + Area);
    }
}
