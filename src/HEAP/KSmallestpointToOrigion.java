package HEAP;

import java.util.Collections;
import java.util.PriorityQueue;

class triplet implements Comparable<triplet>{
    int dist;
    int x;
    int y;

    public triplet(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }
    public int compareTo(triplet t){
        return this.dist-t.dist;
    }
}
public class KSmallestpointToOrigion {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<triplet> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int [] point: points){
            int x=point[0]; int y=point[1];
            int dist=((x*x)+(y*y));
            pq.add(new triplet(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        int [][] ans= new int[k][2];
        for(int i=0;i<k;i++){
            triplet t=pq.remove();
            ans[i][0]=t.x;
            ans[i][1]=t.y;
        }
        return ans;
    }
}
