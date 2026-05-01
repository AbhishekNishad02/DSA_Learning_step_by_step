package Algorithm;

import java.util.*;

public class time_complexity {
    public static void println(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt(),i,j,temp,max;
        int[] arr=new int[n];
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(i=0;i<arr.length;i++){
            println(arr[i]+" ");
        }
    }
}
