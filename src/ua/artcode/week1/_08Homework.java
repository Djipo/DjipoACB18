package ua.artcode.week1;

import java.util.Scanner;

public class _08Homework {

                public static void main (String []args){

                    Scanner sc = new Scanner(System.in);

                    System.out.println(" Input purchase price:");
                    int price = sc.nextInt();

                    if (price > 1000){
                        double purchase = price * 0.1;
                        System.out.println(price - purchase);
                    }else {
                        System.out.println(price);

                    }

                }

}
