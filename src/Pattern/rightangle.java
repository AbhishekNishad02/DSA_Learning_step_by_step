package Pattern;

import java.util.*;

public class rightangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any number ");
        int n = sc.nextInt();
        int a = 1;

        while (a <= n) {
            for (int i = 1; i <= n; i++) {
                if (i <= n - a)
                    System.out.print(" ");
                else
                    System.out.print("#");
            }
            System.out.println();
            a++;
        }
    }  }