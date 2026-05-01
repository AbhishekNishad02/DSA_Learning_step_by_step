package Pattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter row no:- ");
        int i,j,n=sc.nextInt(),a=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
        }
            System.out.println();
    }
}}