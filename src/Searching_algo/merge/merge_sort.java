package Searching_algo.merge;

import java.util.Arrays;

public class merge_sort {
    public static void  merge(int [] a,int [] b){
       int i=a.length-1,j=b.length-1,k=a.length+b.length-1;
       int [] arr=new int[a.length+b.length];
       while(i>=0 && j>=0){
           if(a[i]>b[j]) arr[k--]=a[i--];
           else arr[k--]=b[j--];
       }
       while (i>=0) arr[k--]=a[i--];
       while(j>=0) arr[k--]=b[j--];
       System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int [] a={5,6,7};
        int [] b={2,3,4};
       merge(a,b);

    }
}
