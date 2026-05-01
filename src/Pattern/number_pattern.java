package Pattern;

import java.util.*;

public class number_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter row:- ");
        int n=sc.nextInt(),i,j;
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println(" ");
        }

}}
