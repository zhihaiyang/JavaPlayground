package Algorithm;

import java.util.HashMap;
import java.util.*;

public class lc347 {
	class Node {
		int val;
		int count;
		Node(int val,int count){
			this.val = val;
			this.count = count;
		}
	}
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num:nums) {
        	if(map.containsKey(num)) {
        		map.put(num, map.get(num)+1);
        	}
        	else {
        		map.put(num, 1);
        	}
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> a.count == b.count ? b.val-a.val : a.count-b.count);
        
        for(int num:map.keySet()) {
        	pq.add(new Node(num, map.get(num)));
        	if(pq.size()>k) {
        		pq.poll();
        	}
        }
        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()) {
        	res.add(0, pq.poll().val);
        }
        
        return res;
    }
}
