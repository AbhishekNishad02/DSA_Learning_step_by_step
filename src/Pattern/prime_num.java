package Pattern;

import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n=sc.nextInt(),i,j;
        for(i=1;i<=n;i++){
            int a=0;
            for(j=1;j<=i;j++){
                System.out.print(j+a);
                a+=1;
            }
            System.out.println();
        }
    }
}
