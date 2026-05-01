package D2_Array;

import java.util.Scanner;

public class rotate_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:- ");
        int n = sc.nextInt(), m;
        System.out.print("Enter column:- ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }}
       // int [][]arr2=new int[n][m];
        //int z = 0;
        for (int j = 0; j < m; j++) {
            //int b = 0;
            for (int i = n - 1; i >= 0; i--) {
               // arr2[z][b] = arr[i][j];
                System.out.printf(arr[i][j]+" ");
               // b++;
            }
            System.out.println();
           // z++;
        }
//             for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                arr[i][j] = arr2[i][j];
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }


    }

