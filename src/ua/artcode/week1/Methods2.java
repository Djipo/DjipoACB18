package ua.artcode.week1;

public class Methods2 {

    public static void main(String[] args) {

        int k = div(56);
        System.out.println(k);
        int a = max(k, 6);
        System.out.println(a);
    }

    public static int div(int num) {

        return num / 10;
    }

    public static int max(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

}
