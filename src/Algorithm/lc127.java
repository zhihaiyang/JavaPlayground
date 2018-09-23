package Algorithm;

import java.util.*;

public class lc127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashMap<String, Integer> map = new HashMap<>();//Index of the word
        HashMap<String, Integer> levelMap = new HashMap<>();//Level of the word
        int count = 0;
        for(String s : wordList) {
        	map.put(s, count++);
        }
        if(!map.containsKey(endWord)) {
        	return 0;
        }
        LinkedList<String> queue = new LinkedList<>();
        queue.add(beginWord);
        levelMap.put(beginWord, 1);
        
    	int wl = beginWord.length();
        while(!queue.isEmpty()) {
        	String w = queue.pop();
        	int level = levelMap.get(w);
        	if(w.equals(endWord)) {
        		return levelMap.get(endWord);
        	}
    		StringBuilder sb = new StringBuilder(w);
        	for(int i = 0;i < wl;i++) {
	        	for(int ch = 0; ch < 26; ch++) {
	        		if(w.charAt(i)!=(char)('a'+ch)) {
	        			sb.setCharAt(i, (char)('a'+ch));
	        			String newW = sb.toString();
	        			if(map.containsKey(newW)&&!levelMap.containsKey(newW)) {//&&(w.equals(beginWord)||map.get(w)<map.get(newW))) {
	        				queue.add(newW);
	        				levelMap.put(newW, level+1);
	        			}
	        		}
	        	}
	        	sb.setCharAt(i, w.charAt(i));
        	}
        }
        return 0;
    }
}
