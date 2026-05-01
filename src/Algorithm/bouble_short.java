package Algorithm;

import java.util.*;
public class bouble_short{
    public static void println(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt(),i,j,temp;
        int[] arr=new int[n];
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       println("After sort element:");
        for(i=0;i<n-1;i++) {
            int swap=0;
            for (j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }

        }
        for (i=0;i<n;i++){
            println(arr[i]+" ");
        }


    }
}
