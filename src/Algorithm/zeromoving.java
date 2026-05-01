package Algorithm;

import java.util.Scanner;

public class zeromoving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:- ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        int i,j,temp;
        System.out.println("Enter array element:- ");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (i=0;i<n-1;i++){
            int count=0;
            for(j=0;j<n-1-i;j++){
                if (arr[j]==0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count+=1;

                }
            }
            if(count==0) break;
        }
        System.out.println("Array element after sorted:- ");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

