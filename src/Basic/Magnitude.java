package Basic;

import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int a=sc.nextInt();
        if(a<0){
            a=a*-1;
            if(a>69){
                System.out.println(a+" is greater than 69");
            }
            else {
                System.out.println(a+" is lower than 69");

            }
        }
        else{
            if(a>69){
                System.out.println(a+" is greator than 69");
            }
            else{
                System.out.println(a+" is lower than 69");
            }
        }
    }
}
