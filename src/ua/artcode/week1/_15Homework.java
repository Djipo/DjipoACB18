package ua.artcode.week1;
//15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
//квадрат; б) уместится ли квадрат в круге.
import java.util.Scanner;
public class _15Homework {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Square Circle:");
        double Square = sc.nextDouble();

        System.out.println("Input Square ");
        double Square1 = sc.nextDouble();

        double x1 = Square1 / 4;          // side of square

        double Rv = x1 / 2;
        double Ro = x1 / 1.4;

        if (Rv > Square ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        if (Ro < Square){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        }

        }









