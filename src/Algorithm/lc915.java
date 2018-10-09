package Algorithm;
import java.util.*;

public class lc915 {
    public int partitionDisjoint(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 1;i<A.length;i++) {
        	pq.add(A[i]);
        }
        int max = A[0];
        for(int i = 1;i<A.length;i++) {
        	if(max <= pq.peek()) {
        		return i;
        	}
        	max = Math.max(max, A[i]);
        	pq.remove(Integer.valueOf(A[i]));
        }
        return A.length;
    }
}
