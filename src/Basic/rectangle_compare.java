package Basic;

import java.util.Scanner;

public class rectangle_compare {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length:- ");
        double a,b,c,d;
        a=sc.nextDouble();
        System.out.print("Enter breadth:- ");
        b=sc.nextDouble();
        c=a*b;
        d=2*(a+b);
        if(c>d) System.out.println("Area is greater");
        else System.out.println("Parameter is greater");
    }
}
