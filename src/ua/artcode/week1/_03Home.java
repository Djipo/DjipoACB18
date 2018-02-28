package ua.artcode.week1;

import java.util.Scanner;

public class _03Home {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 3-х значное число:");
        int number = sc.nextInt();

        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 10) / 10;

        if (a == b && a == c) {
            System.out.println("Все числа одинаковые");
        } else if (a == b || a == c || b == c) {
            System.out.println(" Все числа не одинаковы");
        } else {
            System.out.println("нет одинаковых чисел");
        }
    }
}