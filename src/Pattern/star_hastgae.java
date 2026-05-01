package Pattern;

import java.util.Scanner;

public class star_hastgae {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n=sc.nextInt(),m=sc.nextInt(),i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m)
                    System.out.print("* ");
                else

                    System.out.print("# ");
            }
            System.out.println();
        }
    }
}
