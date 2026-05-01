package recursion;

import java.util.Scanner;

public class first_occurence {
    public static int firstocc(int [] arr,int tar,int lo,int n){
        if (lo>n) return -1;
        int mid=lo+(n-lo)/2,idx=-1;
        if(arr[mid]>tar) return firstocc(arr,tar,lo,mid-1);
        else if(arr[mid]<tar) return firstocc(arr,tar,mid+1,n);
        else { idx=mid;
            return firstocc(arr,tar,lo,mid-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter number to find:- ");
        int tar=sc.nextInt();
        System.out.println(firstocc(arr,tar,0,n-1));

    }
}
