package Pattern;

import java.util.Scanner;

public class x_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int i,j,n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
        if(i==j || j==(n+1)-i)
                    System.out.print("* ");
else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
