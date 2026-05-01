package Pattern;

import java.util.Scanner;

public class plus_pattern {
    public static void main( String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plus pattern valid for odd number");
        System.out.print("Enter number of row:- ");
        int n=sc.nextInt(),i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                
                if(i==(n/2+1)|| j==(n/2+1))
                    System.out.print("* ");
                else System.out.print("  ");}

            System.out.println();
        }

    }
}
