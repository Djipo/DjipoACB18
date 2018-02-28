package ua.artcode.week1;
import java.util.Scanner;
//14) Определить, является ли шестизначное число "счастливым" (сумма
//первых трех цифр равна сумме последних трех цифр).

public class _14HomeWork {

            public static void main (String []args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Input six-digit number:");
                int num = sc.nextInt();

                if (num == 100000){
                    System.out.println("Error! Tray again");
                }

                int a1 = num % 10;
                int a2 = num % 100;
                int a3 = num % 1000;

                    int asum  = a1 + a2 + a3;

                int b1 = num / 100000;
                int b2 = num / 10000;
                int b3 = num / 1000;

                    int bsum = b1 + b2 + b3;

                if (bsum == asum) {
                    System.out.println("Lucky number!");
                }else {
                    System.out.println("Tray nex time!");
                }

            }


}
