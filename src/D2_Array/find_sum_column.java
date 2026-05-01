package D2_Array;

import java.util.Scanner;

public class find_sum_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:- ");
        int n = sc.nextInt(), m, a = Integer.MIN_VALUE,row=0;
        System.out.print("Enter column:- ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            if(a<sum){
                a=sum;
                row=1;
            }
        }
        System.out.println("row= "+row+"\nsum= "+a);
    }}
