package Loop;

import java.util.Scanner;

public class siquence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term:- ");
        int i, b = sc.nextInt(), a = 10;
        for (i = 1; i <= b; i++) {
            System.out.println(i);
            System.out.println(a);
            a-=1;
        }
    }
}