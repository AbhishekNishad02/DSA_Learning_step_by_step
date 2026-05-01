package Array;

import java.util.*;

public class deep_copy {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,12,13,14};
        int[] x=arr;
        x[0]=300;
        int[] deep=Arrays.copyOf(arr,arr.length);
        deep[0]=500;
        System.out.println(arr[0]);
    }
}
