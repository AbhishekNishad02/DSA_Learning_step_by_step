package Algorithm;

import java.util.*;

public class Main {
    public static boolean check(int[] arr, int n){
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>arr[i+1]) return false;
        }
return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(check(arr,n));

    }


}