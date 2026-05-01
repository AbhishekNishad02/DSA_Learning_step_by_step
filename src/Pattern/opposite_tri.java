package Pattern;

import java.util.*;

public class opposite_tri {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row:- ");
        int n=sc.nextInt(),i,j;
        for (i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print((char) (70-i)+" ");

            }
            System.out.println(" ");
        }

    }
}
