package recursion;

import java.util.Scanner;

public class GCD_factors {
    public static int GCD(int a,int b){
        if(a==0) return b;
        return GCD(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter our number:- ");
        int a=sc.nextInt(),b;
        System.out.print("Enter our second number:- ");
        b=sc.nextInt();
        System.out.println("HCF= "+GCD(a,b));

    }
}
