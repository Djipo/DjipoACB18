package ua.artcode.week2;

public class Task3 {

    public static void main(String[] args) {
        int lowRange = 0;
        int highRange = 100;
        int count = highRange;

        while (count >= lowRange) {
            System.out.print(count + " ");
            count = count - 2; // count -= 2;
        }
        count++;
        while(count<highRange){
            System.out.print(count + " ");
            count += 2;
        }
    }
}