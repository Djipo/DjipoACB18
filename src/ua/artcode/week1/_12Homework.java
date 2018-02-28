package ua.artcode.week1;
import java.util.Scanner;
//12) Написать программу, которая в зависимости от характера ветра выдает
//сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
//умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
public class _12Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input wind force: ");
        int a = sc.nextInt();

        if (a >= 1 && a < 5) {
            System.out.println("Wind calm");
        } if (a >= 5 && a < 10) {
            System.out.println("Wind moderate");

        } if (a >= 9 && a < 19) {
            System.out.println("Strong Wind");

        } if (a >= 19){
                System.out.println("Huricane");


            }
        }
    }
