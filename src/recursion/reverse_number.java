package recursion;

import java.util.Scanner;

public class reverse_number {
    public static int reverse(int n ,int r){
        if(n==0) return r;
        return reverse(n/10,r*10+n%10);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:- ");
        int n=sc.nextInt(),r=0;
        System.out.println(reverse(n,r));
    }
}
