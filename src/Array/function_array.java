package Array;

public class function_array {
    public static void main(String[] args) {
        int x[]={1,2,3,44,56,78};
        System.out.println(x[2]);
       change(x);
        System.out.println(x[2]);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
    public static void change(int[] x){
        x[2]=33;
    }
}
