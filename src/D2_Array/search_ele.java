package D2_Array;

import java.util.Scanner;

public class search_ele {
    public static boolean search(int [][] arr,int tar){
        int i=0,j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if (arr[i][j]==tar) return true;
            else if(arr[i][j]>tar) j--;
            else i++;
        }

return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row:- ");
        int n=sc.nextInt(),m;
        System.out.print("Enter number of col:- ");
        m=sc.nextInt();
        int [] [] arr=new int [n][m];
        System.out.print("Enter array element :- ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter your target:- ");
        int tar=sc.nextInt();
        System.out.println(search(arr,tar));

    }
}
