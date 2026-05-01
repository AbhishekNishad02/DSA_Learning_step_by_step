package Algorithm;

import java.util.Scanner;


public class insertion_sort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter siZe of array:- ");
        int n=sc.nextInt();
        int []arr=new int[n];
        int i,j,temp;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
            j=i;
            while(j>0 && arr[j-1]>arr[j] ){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
            }
        }
        System.out.println("sorted Array:- ");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
