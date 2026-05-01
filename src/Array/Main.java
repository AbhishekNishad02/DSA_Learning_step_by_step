package Array;

import java.util.*;

class aaa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt(),sum=0;
        int[] arr=new int[n];
        int max=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
            if(arr[i]>max) max=arr[i];
        }
        System.out.print("array element are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sum="+sum);
        System.out.println("maximum number of array="+max);

    }

}