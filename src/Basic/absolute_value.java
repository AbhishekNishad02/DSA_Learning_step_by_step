package Basic;

import java.util.Scanner;

public class absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=sc.nextInt();
        if(a<0){
            a=a*-1;
            System.out.println(a);
        }
        else {
            System.out.println(a);
        }
    }
}
