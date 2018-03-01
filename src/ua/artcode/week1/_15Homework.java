package ua.artcode.week1;
//Известны площади круга и квадрата. Определить: а) уместится ли круг в
//квадрат; б) уместится ли квадрат в круге.
import java.util.Scanner;

public class _15Homework {

          public static void main (String [] args){
            Scanner sc = new Scanner(System.in);

            System.out.println("Input Square Circle:");
            double circleSqr = sc.nextDouble();

            System.out.println("Input Square ");
            double squareSqr = sc.nextDouble();

            double radiusOfCircle = Math.sqrt(circleSqr / Math.PI);
            double squareSide = Math.sqrt(squareSqr);


            double diametr = radiusOfCircle * 2;
            // c^2 = a^2 + b^2
            // c = sqrt(a^2 + b^2)
            double diagonal = Math.sqrt(squareSide * squareSide + squareSide * squareSide);

            if (diametr <= diagonal){
                System.out.println("We can put the circle into the square");
            }else{
                System.out.println("We can not put circel into square");
            }

            if (diagonal <= diametr){
                System.out.println("The Squere may be in the circle");
            }else {
                System.out.println("Impossible to put square into circle");
            }

        }
    }

