package recursion;

public class print_array {
    public static void main(String[] args) {
        int [] arr={5,3,1,7,8,9};
        int ele=11;
        System.out.println(exits(arr,ele,0));
//        printele(arr,0);
    }
//    public  static void printele(int [] arr, int idx){
//        if(idx==arr.length) return;
//        System.out.print(arr[idx]+" ");
//        printele(arr,idx+1);
//        System.out.print(arr[idx]+" ");
//
//    }
    public static boolean exits(int [] arr, int ele,int idx){
        if (idx==arr.length) return false;
        if(arr[idx]==ele) return true;
        return exits(arr,ele,idx+1);

    }
}
