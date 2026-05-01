package Method;

import java.util.Scanner;

public class max_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four number:- ");
        double a, b, c, d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        a = (Math.max(Math.max(a, b), c));
        System.out.println("Maximum num= " + Math.max(a, d));
    }
}
