package ua.artcode.week1;

import java.util.Scanner;

public class _10Homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Week day frm 1 to 7:");
        int a = sc.nextInt();

        System.out.println("Enter talk time:");
        int b = sc.nextInt();

        double d = 0.2; // discount talk time

        if (a == 1 || a == 5) {
            System.out.println("Price = " + b);

        } else if (a == 6 || a == 7){
            System.out.println("Dicount = " + b * d);


        }
    }


}






