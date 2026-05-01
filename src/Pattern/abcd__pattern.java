package Pattern;

import java.util.Scanner;

public class abcd__pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n=sc.nextInt(),i,j;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
