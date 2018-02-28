package ua.artcode.week1;

import java.util.Scanner;

// У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
    public class _04Homework {

        public  static  void  main (String [] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter speed in km/h:" );
            float speed = sc.nextInt();

            System.out.println("Please enter distance in km:");
            float distance = sc.nextInt();

            float time = distance / speed;
            System.out.println("time is: " + time);
        }




}
