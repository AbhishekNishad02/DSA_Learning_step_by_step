package Loop;

import java.util.Scanner;

public class first_pro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //generally use when condition are more than one
        System.out.print("Enter a num:- ");
        int a=sc.nextInt(),b=0;
        while(a>0){
            b+=1;
            a=a/10;
        }
        System.out.println("Number are "+b+" digit");

    }
}
