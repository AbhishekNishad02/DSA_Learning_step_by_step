package Strings;

import java.util.Scanner;

public class compare_to {
    public static int compare(String s,String b) {

            s = s.toUpperCase();
            b = b.toUpperCase();

            int lo = 0;
            while (lo < s.length() && lo < b.length()) {
                if (s.charAt(lo) != b.charAt(lo)) {
                    return s.charAt(lo) - b.charAt(lo);
                }
                lo++;
            }
            return s.length() - b.length();
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="hello",b="hellob";
        System.out.println(compare(s,b));

    }
}
