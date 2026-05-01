package recursion;

import java.util.Scanner;

public class first {
    static int n;
    public static void abhi(int n){
        if(n==0) return;
        System.out.println(n);
         abhi(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        n = sc.nextInt();
        abhi(n);
    }
}
