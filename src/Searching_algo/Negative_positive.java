package Searching_algo;

import java.util.*;

public class Negative_positive {
    public static int maximumCount(int[] arr) {
        int low = 0, hi = arr.length - 1, a;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (arr[mid] >= 0) hi = mid - 1;
            else low = mid + 1;
        }
        a = low;
        hi = arr.length - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2;
            if (arr[mid] <= 0) low = mid + 1;
            else hi = mid - 1;
        }
        int n = (arr.length - low);
        if (a > n) return a;
        else return n;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Maximum= "+maximumCount(arr));

    }
}
