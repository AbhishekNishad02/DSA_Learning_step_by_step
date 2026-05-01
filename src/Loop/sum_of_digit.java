package Loop;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int sum=0,rem,a=sc.nextInt();
        while(a>0){
            rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        System.out.println("The sum is "+sum);
    }
}
