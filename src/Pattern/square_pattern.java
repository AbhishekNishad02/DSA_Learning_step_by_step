package Pattern;

import java.util.*;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter line:- ");
        int i,j,n=sc.nextInt();
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++) {

              if(i==1|| i==n || j==1 || j==n)
                  System.out.print("* ");
             else
                 System.out.print("  ");
            }
            System.out.println();

        }
    }
}
