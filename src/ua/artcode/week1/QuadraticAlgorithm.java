package ua.artcode.week1;

import java.util.Scanner;

public class QuadraticAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Input a");
        double a = input.nextInt();

        System.out.println("input b");
        double b = input.nextInt();

        System.out.println("input c");
        double c = input.nextInt();

        double x1 = 0;
        double x2 = 0;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("invalid parameteres");
                } else {
                    System.out.println(" Block 1");
                }
            } else {
                x1 = -c / b;
                System.out.println("x1 = " + x1);
            }
        } else {
            double d = b * b - 4 * a * c;

            if (d < 0) {
                System.out.println(" Cannot evaluate x2,x1");
            } else {
                if (d == 0) {
                    x1 = -b / 2 * a;
                    System.out.println("x1 = " + x1);
                } else {
                    double sqrD = Math.sqrt(d);
                    x1 = (-b - sqrD) / 2 * a;
                    x2 = (-b + sqrD) / 2 * a;
                    System.out.println("x2 = " + x2);
                    System.out.println("x1 = " + x1);
                }

            }
        }


    }
}
