package recursion;

public class binary_by_recurision {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,11,35};
        int tar=7;
        int n=arr.length-1;
        System.out.println(birecursion(arr,tar,0,n-1));

    }
    public static int birecursion(int [] arr,int tar,int lo,int n){
        if(lo>n) return -1;
        int mid=lo+(n-lo)/2;
        if (arr[mid]==tar) return mid;
        else if (arr[mid]>tar) return birecursion(arr,tar,lo,mid-1);
        else return birecursion(arr,tar,mid+1,n);

    }
}
