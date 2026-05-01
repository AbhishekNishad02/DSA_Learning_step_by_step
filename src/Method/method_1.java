package Method;

import java.util.Scanner;

public class method_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:- ");
        double a=sc.nextDouble(),b;
        System.out.print("Enter number to find cuberoot:- ");
        b=sc.nextDouble();
        System.out.println("square root="+Math.sqrt(a));
        System.out.println("cube root="+Math.cbrt(b));
        System.out.println(Math.max(Math.max(1,3),5));
        System.out.println(Math.pow(2,10));
    }
}
