package Algorithm;
import java.util.*;
public class common_element {
    public static void common(int[] arr1,int[] arr2){
        int i=0,j=0,c=0;
        int[]arr=new int[Math.min(arr1.length,arr2.length)];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                arr[c]=arr1[i];
                c+=1;
                i+=1;
                j+=1;
            }
            else if(arr1[i]>arr2[j]) j+=1;
            else i+=1;
        }
        System.out.println("common elements are:- ");
        for(int n=0;n<c;n++){
            System.out.print(arr[n]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of 1st & 2nd array:- ");
        int a=sc.nextInt(),b=sc.nextInt();
        int[] arr1=new int[a];
        int []arr2=new int[b];
        System.out.print("Enter 1st array element:- ");
        for(int i=0;i<a;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter 2nd array elements:- ");
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        common(arr1,arr2);
    }
}
