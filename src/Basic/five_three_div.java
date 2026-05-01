package Basic;

import java.util.Scanner;

public class five_three_div {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        double a=sc.nextDouble();
        if(a%5==0 && a%3==0){
            System.out.println("Divisible by both 3 and 5");

        }  else if(a%3==0){
            System.out.println("Only divisible by 3");
        } else if (a % 5 == 0) {
            System.out.println("Only divisible by 5");
        }
        else {
            System.out.println("not divisible by 3 and 5");
        }

    }
}
