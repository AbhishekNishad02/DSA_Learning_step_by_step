package Algorithm;

import java.util.Scanner;

public class ZeroMovingOptimized {
    public static void sort(int[] arr,int n){
         for (int i=0;i<n-1;i++){
        int count=0;
        for(int j=0;j<n-1-i;j++){
            if (arr[j]>arr[j+1]){
               int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                count+=1;

            }
        }
        if(count==0) break;
    }
    }
    public static void Zero(int[] arr,int n){
        int pos = 0; // index to place non-zero
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[pos]=arr[i];
                pos+=1;

            }
        }
        // Fill remaining with zeros
        while (pos < n) {
            arr[pos] = 0;
            pos++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array element:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
         sort(arr,n);
        Zero(arr,n);


        System.out.println("Array element after moving zeros:- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

