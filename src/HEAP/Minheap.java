
package HEAP;
import java.util.*;
public class Minheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> a=new PriorityQueue<>();
        a.add(10); a.add(40); a.add(2); a.add(1);
        System.out.println("Minheap element print....");
        System.out.println(a);
        a.remove();
        System.out.println(a);
        a.poll();
        System.out.println(a);
    }
}
