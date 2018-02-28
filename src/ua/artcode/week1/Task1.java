package ua.artcode.week1;

public class Task1 {
    public static void main(String[] args) {

        String name = "timur";
        int age = 21;
        int money = 150;

        if(age < 16){
            System.out.println("You are so young, back to us at 18");
        } else if (age < 23){
            if ( money >= 10000){
                System.out.println( "Welcome to our University ");
            } else {
                System.out.println( "Back when you have enough money");
            }

        }




    }




}
