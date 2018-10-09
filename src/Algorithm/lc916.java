package Algorithm;
import java.util.*;

public class lc916 {
    public List<String> wordSubsets(String[] A, String[] B) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        
        for(String w : B) {
        	HashMap<Character, Integer> wmap = new HashMap<>();
        	for(char c : w.toCharArray()) {
        		if(wmap.containsKey(c)) {
        			wmap.put(c, wmap.get(c)+1);
        		}
        		else {
        			wmap.put(c, 1);
        		}
        	}
        	for(char c : wmap.keySet()) {
        		if(map.containsKey(c)) {
        			if(wmap.get(c) > map.get(c)) {
        				map.put(c, wmap.get(c));
        			}
        		}
        		else {
        			map.put(c, wmap.get(c));
        		}
        	}
        }
        
        for(String w : A) {
        	HashMap<Character, Integer> wmap = new HashMap<>();
        	for(char c : w.toCharArray()) {
        		if(wmap.containsKey(c)) {
        			wmap.put(c, wmap.get(c)+1);
        		}
        		else {
        			wmap.put(c, 1);
        		}
        	}
        	boolean isSubset = true;
        	for(char c : map.keySet()) {
        		if(wmap.containsKey(c)) {
        			if(wmap.get(c) < map.get(c)) {
        				isSubset = false;
        				break;
        			}
        		}
        		else {
        			isSubset = false;
        			break;
        		}
        	}
        	if(isSubset) {
        		res.add(w);
        	}
        }
        return res;
    }
}
