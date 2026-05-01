package Basic;

import java.util.Scanner;

public class loss_profit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price");
        double a=sc.nextDouble(),b;
        System.out.println("Enter sellling price");
        b=sc.nextDouble();
        if(b>=a){
            double c=b-a;
            System.out.println("Profit = "+c);
        }
        else{
            double c=a-b;
            System.out.println("loss = "+c);
        }
    }
}
