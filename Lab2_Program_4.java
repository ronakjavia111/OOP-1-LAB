package com.company;
import java.util.Scanner;

public class Lab2_Program_4 {
    public static void main(String[] args) {
        int m1, m2, m3, m4, m5, sum;
        double per;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of 5 Subject : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        m4 = sc.nextInt();
        m5 = sc.nextInt();

        sum = m1+m2+m3+m4+m5;
        per = sum/5;
        System.out.println("Percentage = "+ per);
    }
}
