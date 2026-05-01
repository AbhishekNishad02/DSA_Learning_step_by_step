package Loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++) System.out.println(a+"*"+i+"="+a*i);
    }

}