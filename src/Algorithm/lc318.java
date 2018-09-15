package Algorithm;

public class lc318 {
    public int maxProduct(String[] words) {
    	int res = 0;
        
    	int[] codes = new int[words.length];
    	
    	for(int i =0;i<words.length;i++) {
    		codes[i] = convertStr(words[i]);
    	}
    	
        for(int i = 0; i<words.length;i++) {
        	for(int j=0; j<words.length;j++) {
        		if((codes[i]&codes[j])==0) {
        			int val = words[i].length() * words[j].length();
        			if(val>res) {
        				res = val;
        			}
        		}
        	}
        }
        return res;

    }
    
    int convertStr(String str) {
    	int res = 0;
    	for(int i =0;i<str.length();i++) {
    		char c = str.charAt(i);
    		res |= 1 << (c-'a');
    	}
    	return res;
    }
}
