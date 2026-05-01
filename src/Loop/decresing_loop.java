package Loop;

import java.util.Scanner;

public class decresing_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a term:- ");
        int a=99,b=4,n=sc.nextInt(),z=1;
        for(int i=1;i<=n;i++){

            System.out.println(a+" "+z);
            a=a-b;
            z+=1;


        }
    }
}
