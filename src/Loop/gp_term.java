package Loop;

import java.util.Scanner;

public class gp_term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter term:- ");
        int i,a=1,r=2,c=sc.nextInt();
        for(i=1;i<=c;i++){
            System.out.println(a+" "+i);
            a*=r;
        }
    }
}
