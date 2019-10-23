package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double num3 = 0;

        System.out.println("First Number:");
        num1 = key.nextDouble();

        System.out.println("Second Number:");
        num2 = key.nextDouble();

        System.out.println("Third Number:");
        num3 = key.nextDouble();

        System.out.println(num1 + num2 + num3);
    }
}
