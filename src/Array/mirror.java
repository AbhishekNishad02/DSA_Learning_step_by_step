package Array;

import java.util.*;

public class mirror {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] [] arr=new int[4][4];
        int i,j;
        for(i=0;i<4; i++){
            for( j=0;j<4;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for( i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(arr[j][i]+" ");

            }
            System.out.println();
        }

    }
}
