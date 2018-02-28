package ua.artcode.week1;
import java.util.Scanner;
// Даны три числа A,B,C. Увеличить числа в два
//раза, если A+B+C>0, в противном случае заменить
//на нули.
public class _13Homework {
public static void main (String []args){

    Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
            int a = sc.nextInt();
        System.out.println("Input b");
            int b = sc.nextInt();
        System.out.println("Input c");
            int c = sc.nextInt();
        if (a + c + b > 0){
              a *= 2;
              b *= 2;
              c *= 2;
        }else {
            a = 0;
            b = 0;
            c = 0;
        }  System.out.println (" a =" + a + "b" + b);
}



}
