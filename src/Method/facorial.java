package Method;

import java.util.Scanner;
public class facorial{
    public static long  ask(long a) {
        if(a==0 || a==1) return 1;
        else return a*ask(a-1);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to fnd factorial:- ");
        long  a=sc.nextLong(),b;
        System.out.print("Enter number r:- ");
        b=sc.nextLong();

        long ncr=ask(a)/(ask(b)*ask(a-b));
        System.out.println("NCR="+ncr);
        long npr=ask(a)/ask(a-b);
        System.out.println("NPR="+npr);

    }
}
