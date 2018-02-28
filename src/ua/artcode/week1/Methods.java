package ua.artcode.week1;

public class Methods {

    // declare the method = signature(rettyp,name,args(inputdata))
    public static void hello(){
        System.out.println("Hello");
    }

    public static int getNum(){
        return 1;
    }

    public static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    public static void showUserInfo(String name, int age){
        System.out.println("Name " + name + " age " + age);
    }

    public static int inc(int num){
        return num + 1;
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }



    public static void main(String[] args) {
        System.out.println("Before");
        hello();
        System.out.println("After");


        int num = getNum();
        System.out.println("num " + num);

        sayHello("Jenia");

        showUserInfo("Oleg", 24);

        int res = inc(10);
        System.out.println(res);

        int c = sum(num,res);
        System.out.println(c);

    }



}



