package D2_Array;

import java.util.Scanner;

public class spirally_traversing_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows of Array:- ");
        int n=sc.nextInt(),m;
        System.out.print("Enter cols of array:- ");
        m=sc.nextInt();
        int [][] arr=new int[n][m];
        System.out.print("Enter array elements: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
}
