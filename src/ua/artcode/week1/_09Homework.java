package ua.artcode.week1;

import java.util.Scanner;

public class _09Homework {
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Input yours weight:");
            int a = sc.nextInt();

            System.out.println("Input yours height:");
            int b = sc.nextInt();

            int c = a - 100;

            if (a > c){
                System.out.println("You need to lose weight" + c);
            }else if (a < c){
                System.out.println("You do not need to lose weight");
            }

        }





}
