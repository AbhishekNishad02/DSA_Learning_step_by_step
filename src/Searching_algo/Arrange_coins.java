package Searching_algo;

import java.util.Scanner;

public class Arrange_coins {
    public static int count(int n){
        int i=1, a=-1;
        while(n>=0){
            n-=i;
            i+=1;
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of coins:- ");
        int n=sc.nextInt();
        System.out.println(count(n));
    }

}
