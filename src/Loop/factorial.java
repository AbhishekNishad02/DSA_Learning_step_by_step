package Loop;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int a=sc.nextInt(),i,sum=1;
        for(i=1;i<=a;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
