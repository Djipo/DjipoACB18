package ua.artcode.week1;

 import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input First");
        int num1= sc.nextInt();

        System.out.println("Input Second");
        int num2= sc.nextInt();

        System.out.println("Input Third");
        int num3= sc.nextInt();

        System.out.println(num1 + ", " + num2 + ", " + num3);

        if (num1 > 0){
            num1 = num1 * num1 * num1;
        }else if(num1 < 0);{
            num1 = 0;
        }

        if (num2 > 0){
            num2 = num2 * num2 * num2;
        }else if(num2 < 0); {
            num2 = 0;
        }
        if (num3 > 0){
            num3 = num3 * num3 * num3;

        }else if(num3 < 0){
            num3 = 0;
        }
        System.out.println(num1 + ", " + num2 + ", " + num3);

    }



}
