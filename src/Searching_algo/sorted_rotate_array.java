package Searching_algo;


import java.util.*;

public class sorted_rotate_array {
    public static int search(int[] arr, int n) {
        int lo=0,hi=arr.length-1;
        while(lo<hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid]>arr[hi]) lo = mid + 1;
            else hi = mid;
        }
        int a=lo;
        lo=0;
        hi=arr.length-1;
        if(arr[a]<=n && n<=arr[arr.length-1]){
            lo=a;
        }
        else{
            hi=a-1;
        }
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==n) return mid;
            else if(arr[mid]<n) lo=mid+1;
            else hi=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int a= sc.nextInt();
        int[] arr=new int[a];
        System.out.print("Enter array elements: -");
        for (int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target: ");
        int n=sc.nextInt();
        System.out.println("array index= "+search(arr,n));

    }
}
