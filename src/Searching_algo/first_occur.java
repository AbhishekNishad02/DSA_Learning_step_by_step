package Searching_algo;

import java.util.Arrays;
import java.util.Scanner;

public class first_occur {
    public static int binary(int[] arr,int target){
        int low=0,high=arr.length-1,idx=-1;
        while (low <= high) {
            int mid=(low+high)/2;
            if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;
            else {
                idx=mid;
                high=mid-1;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter array element:- ");
        for ( int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("Enter number to search:- ");
        int target=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binary(arr,target));

    }
}
