package Loop;

import java.util.Scanner;

public class power_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the num:- ");
        int a=sc.nextInt(),b,i,pow=1;
        System.out.print("Enter the pow:- ");
        b=sc.nextInt();
        for(i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println(pow);

    }
}
