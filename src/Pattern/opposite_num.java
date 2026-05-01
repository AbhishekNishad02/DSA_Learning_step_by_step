package Pattern;

import java.util.Scanner;

public class opposite_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n=sc.nextInt(),i,j;
        for(i=1;i<=n;i++){
            for(j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
