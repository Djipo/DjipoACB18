package ua.artcode.week1;

import java.util.Scanner;
//11) Написать программу, которая при вводе числа в диапазоне от 1 до 99
//добавляет к нему слово "копейка" в правильной форме. Например, 1
//копейка, 5 копеек, 42 копейки .

public class _11Homework {
    public  static void  main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input namber frm 1 to 99:");
        int a = sc.nextInt();

        if (a % 10 == 1) {
            System.out.println(a + " копейка");

        } else if (a % 10 <= 4 && a % 10 >= 2){
            System.out.println(a + " копейки");

            if ((a % 10 <= 9 && a % 10 >= 5) || a % 10 == 0) {
             System.out.println(a + " копеек ");
            }

            }
        }
    }




//public class YourClassNameHere {
//2	    public static void main(String[] args) {
//3	      int a = 11;
//4	      int last = a % 10;
//5
//6	      if (last == 1) {
//7	          System.out.println(a + " копейка");
//8	      } else if (last >= 2 && last <= 4){
//9	        System.out.println(a + " копейки");
//10
//11	      } else if (last >= 5 && last <= 9) {
//12	       System.out.println(a + " копеек ");
//13	      }
//14	    }