package Loop;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int a=sc.nextInt(),sum=0,rem;
        int num=a;
        while(a>0){
            rem=a%10;
            sum=rem+(sum*10);
            a=a/10;
        }
        System.out.println(sum);
        System.out.println(sum+num);
    }
}
