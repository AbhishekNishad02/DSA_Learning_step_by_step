package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

public class kth_largest_ele {
    public static int largest(int[] arr, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int ele: arr){
            p.add(ele);
            if(p.size()>k) p.remove();
        }
        return p.peek();
    }
}
