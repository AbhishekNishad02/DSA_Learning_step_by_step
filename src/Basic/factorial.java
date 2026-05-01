package Basic;

import java.util.Scanner;

public class factorial {
    public static int fact(int a){
        if(a==0 || a==1) return 1;
        return a=a*fact(a-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int a=sc.nextInt();
        System.out.println(fact(a));
    }
}
