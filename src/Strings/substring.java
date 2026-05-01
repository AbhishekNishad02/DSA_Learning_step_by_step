package Strings;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        String s="gopi";
        for(int i=0;i<s.length()+1;i++){
            for(int j=i;j<s.length()+1;j++){
        System.out.print(s.substring(i,j)+" ");
    }
            System.out.println();
        }
    }
}
