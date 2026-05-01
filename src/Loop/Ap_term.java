package Loop;

import java.util.Scanner;

public class Ap_term {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter terms:- ");
        int i,a=sc.nextInt();
        for(i=2;i<=(3*a-1);i+=3){
            System.out.println(i);

        }
    }
}
