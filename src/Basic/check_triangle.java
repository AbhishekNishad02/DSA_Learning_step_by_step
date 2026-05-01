package Basic;

import java.util.Scanner;

public class check_triangle {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter first side:- ");
        int a,b,c;
        a=sc.nextInt();
        System.out.print("Enter second side:- ");
        b=sc.nextInt();
        System.out.print("Enter third side:- ");
        c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println("This is triangle");
        }
        else System.out.println("This is not triangle");

    }
}
