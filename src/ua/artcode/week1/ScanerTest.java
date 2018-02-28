package ua.artcode.week1;

import java.util.Scanner;

public class ScanerTest {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" What is your name?");
        String name = sc.next();
        System.out.println("Hello " + name);

        System.out.println("How old are you?");
        int age = sc.nextInt();

        if (age >= 70){
            System.out.println("You are aged to perfection!");

        }else {
            System.out.println("You are a spring chicken!");
        }


    }

}