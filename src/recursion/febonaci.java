package recursion;

import java.util.Scanner;

public class febonaci {
    public static int febo(int a){
        if(a==0 || a==1) return a;
        return febo(a-1)+febo(a-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your terms:- ");
        int a=sc.nextInt();
        System.out.print(febo(a));
    }
}
