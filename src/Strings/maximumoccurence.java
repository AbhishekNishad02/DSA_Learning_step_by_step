package Strings;

import java.util.Arrays;
import java.util.Scanner;


public class maximumoccurence {
    public static char getmax(String s){
        int n=s.length();
        int max=0,i=0,j=0;
        char ans=s.charAt(0);
        char []arr=s.toCharArray();
         Arrays.sort(arr);
        while(j<n) {
            if (arr[i] == arr[j]) j++;
            else {
                int a=j;
                if(a>max){ max=a;
                    ans=arr[j];
                }
                i=j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getmax(s));
    }
}