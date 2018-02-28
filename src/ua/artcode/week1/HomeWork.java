package ua.artcode.week1;


import java.util.Scanner;

public class HomeWork {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number 1");
        int number1 = sc.nextInt();

        System.out.println("Input number 2");
        int number2 = sc.nextInt();

        System.out.println("Input number 3");
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Number1 " + number1 + " is the  Biggest than others");
        }
        if (number2 > number1 && number2 > number3) {
            System.out.println("Number2 " + number2 + " is the  Biggest than others");
        }
        if (number3 > number1 && number3 > number2) {
            System.out.println("Number3 " + number3 + " is the  Biggest than others");
        }


    }
}


