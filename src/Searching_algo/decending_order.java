package Searching_algo;


import java.util.*;

public class decending_order {
    public static int dicen(int []arr,int target){
        int low=0,high=arr.length-1,idx=-1;
        while(low<=high){
            int min=(low+high)/2;
            if(arr[min]>target) low=min+1;
            else if(arr[min]<target) high=min-1;
            else {
               return idx=min;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt(),target;
        int[] arr=new int[n];
        System.out.print("Enter element of array:- ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i=0,b=arr.length-1;
        while(i<=b){
            int temp=arr[i];
               arr[i]=arr[b];
               arr[b]=temp;
               i+=1;b-=1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter target:- ");
        target=sc.nextInt();
        System.out.println(dicen(arr,target));
    }
}
