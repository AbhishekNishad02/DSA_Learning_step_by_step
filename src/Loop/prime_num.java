package Loop;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:- ");
        int a = sc.nextInt(), i, d = 0;
        for (i = 1; i <= a; i++) {
            if (a % i == 0) {
                d+=1;
            }
            if(d==3) break;
        }
        if(d==3) System.out.println(a+" Is not  Prime Number");
        else System.out.println(a+"  prime number");
    }

    }
