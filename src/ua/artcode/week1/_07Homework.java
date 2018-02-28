package ua.artcode.week1;
// Дано трехзначное число. Определить: а) верно ли, что все его цифры
      //  одинаковые; б) есть ли среди его цифр одинаковые.
import java.util.Scanner;

public class _07Homework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Input number:");
        int num = sc.nextInt();

        int a = num / 100;
        int aa = num % 100;
        int b = aa / 10;
        int c = aa % 10;

        if (a == b && b == c) {
            System.out.println("all numbers are the same!");

        } else if (a == b || a == c || b == c){
            System.out.println("No all numbers are the same!");
        } else {
            System.out.println("no same number");
        }


    }
}