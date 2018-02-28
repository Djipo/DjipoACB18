package ua.artcode.week1;
//Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
//времени года. Если пользователь введет недопустимое число, программа
//должна выдать сообщение об ошибке.
import java.util.Scanner;

public class _06Homework {
            public  static void main (String [] args){

                Scanner sc = new Scanner(System.in);
                System.out.println(" Input month frm 1 to 12");

                int a = sc.nextInt();

                if (a < 0 || a > 12){
                    System.out.println(" Error Wrong number!" );

                }else  if (a == 1 || a == 2 || a == 12){
                    System.out.println("Winter Now!");

                }else if (a >= 3 && a <= 5){
                    System.out.println("Spring Come");

                }else if (a >= 6 && a <= 8){
                    System.out.println("Summer Now");

                }else if (a >= 9 && a <= 11){
                    System.out.println("Autumn Now");
                }


    }



}
