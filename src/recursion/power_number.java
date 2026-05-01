package recursion;
import java.util.*;
public class power_number {
    public static int power(int a,int b){
        if(b==0) return 1;
        int call=power(a,b/2);
        if(b%2==0) return call*call;
        else return call*call*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :- ");
        int a=sc.nextInt(),b;
        System.out.print("Enter pow number:- ");
        b=sc.nextInt();
        System.out.println(power(a,b));
    }
}
