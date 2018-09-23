package Algorithm;
import java.util.*;

public class lc30 {
    public List<Integer> findSubstring(String s, String[] words) {
    	Set<Integer> res = new HashSet<>();
        HashMap<String, Integer> map0 = new HashMap<>();
        if(s == null || s.length() == 0 || words == null || words.length == 0) {
        	return new ArrayList<>(res);
        }
        for(String w: words) {
        	if(map0.containsKey(w)) {
        		map0.put(w, map0.get(w)-1);
        	}
        	else {
        		map0.put(w, -1);
        	}
        }
        
        int wl = words[0].length();
        int totalLen = words.length * wl;
        int start = 0;
        int end = 0;
        int count = 0;
        for(int i = 0; i < wl; i++) {
        	start = i; end = start; count = 0;
            HashMap<String, Integer> map = new HashMap<>(map0);
        	while(start+totalLen-1 < s.length()) {
		        while(count < words.length && end+wl-1 < s.length()) {
		        	String w = s.substring(end, end + wl);
		        	if(map.containsKey(w)) {
		        		int c = map.get(w);
		        		map.put(w, c+1);
		        		if(c<0) {
		        			count++;
		        		}
		        		else {
		        			// Second valid word found, move start forward till first word drops
		        			while(start<end) {
		        				String s1 = s.substring(start, start + wl);
		        				start += wl;
		        				if(s1.equals(w)) {
		        					map.put(w, 0);
		        					break;
		        				}
		        				else {
		        					map.put(s1, map.get(s1)-1);
		        					count--;
		        				}
		        			}
		        		}
		        		end += wl;
		        	}
		        	else {
		        		// invalid letter found before all words are found
		        		// reset start & end & count & map
		        		map = new HashMap<>(map0);
		        		start = end + wl;
		        		end = start;
		        		count = 0;
		        	}
		        }
		        if(count == words.length) {
		        	// result found
		        	res.add(start);
		        	String s1 = s.substring(start, start + wl);
		        	map.put(s1, -1);
		        	start += wl;
		        	count --;
		        }
		        else {
		        	//"end" comes to the end of string
		        	break;
		        }
	        }
        }
        
        return new ArrayList<>(res);
    }
}
