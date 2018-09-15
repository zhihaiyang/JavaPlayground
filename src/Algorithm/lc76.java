package Algorithm;

import java.util.*;

public class lc76 {
    public String minWindow(String s, String t) {
    	HashSet<Character> charSet = new HashSet<>();
	    for(char c: t.toCharArray()) {
	    	charSet.add(c);
	    }
	    
        LinkedList<Character> range = new LinkedList<>();
        HashMap<Character,Integer> map = new HashMap<>();

        int start = -1;
        int length = -1;
        
        char[] array = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
        	if(charSet.contains(array[i])) {
        		if(!map.containsKey(array[i])) {
        			range.add(array[i]);
        		}
        		else {
        			range.removeFirstOccurrence(array[i]);
        			range.add(array[i]);
        		}
    			map.put(array[i], i);
    			
    			if(range.size() == charSet.size()) {
    				int can = map.get(range.getLast()).intValue() - map.get(range.getFirst()).intValue(); 
    				if(length == -1) {
    					length = can;
    					start = map.get(range.getFirst());
    				}
    				else if(length>can) {
    					length = can;
    					start = map.get(range.getFirst());
    				}
    			}
        	}
        }
        
        return (start == -1)? "" : s.substring(start, start+length+1);
    }
}
