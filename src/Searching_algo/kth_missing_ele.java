package Searching_algo;

import java.util.Scanner;

public class kth_missing_ele {
    public static int miss(int [] arr,int n){
        int lo=0,hi=arr.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            int correct=mid+1;
            int miss=arr[mid]-correct;
            if(miss>=n)hi=mid-1;
            else lo=mid+1;
        }
        return (hi+1+n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.print("Enter array element:- ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(miss(arr,n));
    }
}
