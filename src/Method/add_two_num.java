package Method;

import java.util.Scanner;

public class add_two_num {
    public static int aa( int a,int b,int c) {
        if (a>b && a>c) return a;
        else if (b>a && b>c) return b;
        else return c;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter all numbers:-");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("gratest num="+aa(a,b,c));

    }
}
