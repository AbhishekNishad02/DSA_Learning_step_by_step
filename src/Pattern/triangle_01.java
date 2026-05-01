package Pattern;

import java.util.Scanner;

public class triangle_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        for(i=5;i>=0;i--){
            for(j=0;j<=5;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else System.out.print("* ");

            }
            System.out.println();
        }
        for (i=0;i<=5;i++){
            for(j=0;j<=5;j++){
                if(j>i) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
