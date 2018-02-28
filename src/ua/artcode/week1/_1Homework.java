package ua.artcode.week1;

import java.util.Scanner;

public class _1Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("a:");
        int num1 = sc.nextInt();

        System.out.println("b:");
        int num2 = sc.nextInt();

        System.out.println("c:");
        int num3 = sc.nextInt();

        if (num1 < num2 + num3) {
            if (num2 < num1 + num2) {
                if (num3 < num1 + num2) {
                    System.out.println(" Triangle Exist");
                } else {
                    System.out.println("Trianle no Exist !");
                }


            }


        }
    }
}
