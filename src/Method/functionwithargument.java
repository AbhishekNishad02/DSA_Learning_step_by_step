package Method;

import java.util.Scanner;

public class functionwithargument {
    public static void sum(int a,int b) {
        System.out.println("sum= "+(a+b));

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter two num:- ");
        int a=sc.nextInt(),b=sc.nextInt();
        sum(a,b);

    }
}
