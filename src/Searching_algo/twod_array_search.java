package Searching_algo;

import java.util.Scanner;

public class twod_array_search {
    public static boolean find(int[][] arr,int tar){
        int rows=arr.length,cols=arr[0].length;
        int lo=0,hi=rows*cols-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int r=mid/cols,c=mid%cols;
            if(arr[r][c]==tar) return true;
            else if (arr[r][c]>tar) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1D size of array:- ");
        int n=sc.nextInt();
        System.out.print("Enter 2D size of array:- ");
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
;            }
        }
        System.out.print("Enter your target:- ");
        int tar=sc.nextInt();
        System.out.println(find(arr,tar));
    }
}
