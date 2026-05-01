package Searching_algo.merge;

import java.util.ArrayList;
import java.util.Scanner;

public class Apply_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i<n;i++){
            while(arr[i]!=i+1 && arr[i]>=1 && arr[i]<=n){
                    int c=arr[i];
                    int temp= arr[i]-1;
                    if(arr[temp] == c){
                        if(!ans.contains(c)) ans.add(c);
                        break;
                    }
                    arr[i]=arr[temp];
                    arr[temp]=c;
                }

            }
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
