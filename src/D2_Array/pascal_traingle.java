package D2_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num:- ");
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for (int i=0;i<n;i++){
            arr.add(new ArrayList<>());
            for (int j=0;j<=i;j++){
                if(j==0 || i==j) arr.get(i).add(1);
                else{
                    int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).add(val);
                }
            }
        }
        for (List<Integer> a :arr){
            for (int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
