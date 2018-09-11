package Algorithm;

import java.util.*;

public class lc692 {
	// O(n log k) time and O(n) extra space.
	class Node {
		String str;
		int count;
		
		public Node(String str, int count) {
			this.str = str;
			this.count = count;
		}
	}
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String, Integer> map = new HashMap<>();
        for(String w : words) {
        	if(!map.containsKey(w)) {
        		map.put(w, 1);
        	}
        	else {
        		int c = map.get(w);
        		map.put(w, c+1);
        	}
        }
        PriorityQueue<Node> q = new PriorityQueue<>((a,b)-> {return a.count-b.count == 0 ? b.str.compareTo(a.str) : a.count - b.count;});
        
        for(String key : map.keySet()) {
        	int c = map.get(key);
    		q.offer(new Node(key, c));
        	if(q.size() > k) {
        		q.poll();
        	}
        }
        
        List<String> res = new ArrayList<>();
        while(!q.isEmpty()) {
        	res.add(0, q.poll().str);
        }
        return res;
    }
}
