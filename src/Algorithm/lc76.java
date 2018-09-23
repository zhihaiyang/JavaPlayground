package Algorithm;

import java.util.*;

public class lc76 {
    public String minWindow(String s, String t) {
    	HashMap<Character, Integer> charSet = new HashMap<>();
	    for(char c: t.toCharArray()) {
	    	if(charSet.containsKey(c)) {
	    		charSet.put(c, charSet.get(c)-1);
	    	}
	    	else {
	    		charSet.put(c, -1);
	    	}
	    }
	    
	    int startIndex = 0;
	    int length = -1;
	    
	    int type = 0;
	    int start = 0;
	    int end = 0;
    	while(end < s.length()) {
        	if(charSet.containsKey(s.charAt(end))) {
        		int cur = charSet.get(s.charAt(end));
        		if(cur < 0) {
        			type++;
        		}
        		charSet.put(s.charAt(end), cur + 1);
        	}
        	
        	// End found
        	if(type == t.length()) {
        		System.out.println("Start: " + start + ", End found: " + end);
        		// Shrink start to a next start.
        		while(type==t.length() && start <= end) {
        			if(charSet.containsKey(s.charAt(start))) {
        				int cur = charSet.get(s.charAt(start));
    	        		charSet.put(s.charAt(start), cur - 1);
        				if(cur == 0) {
        					System.out.print("Forward start, min boundary is [" + start + ", " + end + "]");
    						type--;
        				}
        			}
        			start++;
        		}
        		System.out.println(", New start: " + start + " to find end");
        		if(length < 0 || length > (end - start+2)) {
        			length = end - start+2;
        			startIndex = start-1;
        		}
        	}
        	end++;
    	}
        
        return length == -1 ? "" : s.substring(startIndex, startIndex+length);
    }
}
