package D2_Array;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows:- ");
        int n=sc.nextInt(),m,a=Integer.MAX_VALUE;
        System.out.print("Enter column:- ");
        m=sc.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
                if(max<arr[i][j]) max=arr[i][j];
            }
            if(a>max) a=max;

        }
        System.out.println(a);
    }
}
