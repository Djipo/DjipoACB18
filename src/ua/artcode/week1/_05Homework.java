package ua.artcode.week1;

//Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
//пара равных
import java.util.Scanner;

public class _05Homework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number:");
        int a = sc.nextInt();
        System.out.println("Please enter second number:");
        int b = sc.nextInt();
        System.out.println("Please enter third number:");
        int c = sc.nextInt();

        if (a == b || a == c || b == c){
            System.out.println("There is at least one pair numbers");

        }else{
            System.out.println("No same numbers");
        }
    }









    }
