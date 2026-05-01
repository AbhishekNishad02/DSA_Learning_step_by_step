package Pattern;

import java.util.Scanner;

public class num123_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n=sc.nextInt(),i,j,a=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
                a+=1;
            }
            System.out.println();
        }
    }
}
