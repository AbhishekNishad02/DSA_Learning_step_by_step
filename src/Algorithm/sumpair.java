package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class sumpair {
    public static void sum(int[] arr,int target){
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if (sum==target) {System.out.println("["+i+","+j+"]");
            return;
            }
            else if(sum>target) j--;
            else i++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt(),target;
        int []arr=new int[n];
        System.out.print("Enter array element:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("your array is sort");
        System.out.print("Enter target num:- ");
        target=sc.nextInt();
        sum(arr,target);


    }
}
