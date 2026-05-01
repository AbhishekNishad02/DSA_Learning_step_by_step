package D2_Array;


import java.util.*;

public class D2_array_list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10); a.add(15); a.add(30); a.add(40);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(11); b.add(14); b.add(67);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(11); c.add(22); c.add(33);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a); arr.add(b);
        arr.add(c);
//        for (int i=0;i<arr.size();i++){
//            for (int j=0;j<arr.get(i).size();j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }
        arr.add( new ArrayList<Integer>());
        arr.get(arr.size()-1).add(10);arr.get(arr.size()-1).add(20);

for (ArrayList<Integer> list: arr){
    for (int ele:list){
        System.out.print(ele+" ");
    }
    System.out.println();
}

    }
}
