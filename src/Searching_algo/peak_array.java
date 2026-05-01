package Searching_algo;

import java.util.Scanner;

public class peak_array {
    public static int peakIndexInMountainArray(int[] arr) {
    int low=1,high=arr.length-2,mid;
    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
        else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]) low=mid+1;
        else high=mid-1;
    }
    return -1;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i=0;i<n;i+=1){
            arr[i]=sc.nextInt();
        }
        System.out.println("peak="+peakIndexInMountainArray(arr));
    }
}
