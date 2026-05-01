package D2_Array;

import java.util.Scanner;

public class snake_print_column {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows:- ");
        int n = sc.nextInt(), m;
        System.out.print("Enter column:- ");
        m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }}
        for (int i=0;i<m;i++){
            if(i%2==0){
                for(int j=0;j<n;j++){
                    System.out.print(arr[j][i]+" ");
                }
            }
            else{
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+" ");
            }}
            System.out.println();
        }
    }
}
