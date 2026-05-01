package Basic;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        // calculate volume of sphere
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radious");
        double a= sc.nextDouble(), b=4,c=3,d=b/c;
        double z=(22.00/7.00)*d*a*a*a;
        System.out.println(z);

    }
}
