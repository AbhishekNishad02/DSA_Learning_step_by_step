package Pattern;

import java.util.*;

public class triangle_pattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter column no:- ");
        int i,j,n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if(i%2==0) System.out.print((char)(j+64)+" ");
                else System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
