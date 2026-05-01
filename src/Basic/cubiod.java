package Basic;

import java.util.Scanner;

public class cubiod {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter height");
      double a=sc.nextDouble(),b,c;
        System.out.println("Enter width");
              b=sc.nextDouble();
        System.out.println("enter length");
              c=sc.nextDouble();
      double d=2.0*(a*b+b*c+a*c);
        System.out.println(d);
    }
}
