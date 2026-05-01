package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class opening_bracket {
    public static void brackt(int n, int l, int r, String s, List<String> ans) {
        if(r==n){
            ans.add(s);
            return;
        }
        if (l<n) brackt(n,l+1,r,s+"(",ans);
        if (r<l) brackt(n,l,r+1,s+")",ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your num:-  ");
        int n=sc.nextInt();
        List<String> ans=new ArrayList<>();
        brackt(n,0,0,"",ans);
        System.out.println(ans);


    }
}
