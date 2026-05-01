package Strings;

import java.util.Scanner;


public class palindrome_string {
    public static boolean palindrome(String str){
        int lo=0,hi=str.length()-1;
        while(lo<hi){
            if(str.charAt(lo)!=str.charAt(hi)) return false;
            else{
                lo++;
                hi--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:- ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        str=str.replace("\\s+ " ,"");
        System.out.println(palindrome(str));
    }
}
