package HEAP;
import java.util.*;
public class kth_smallest_ele {
    public static int smallest(int[] arr, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr){
            p.add(ele);
            if(p.size()>k) p.remove();
        }
        return p.peek();
    }
}
