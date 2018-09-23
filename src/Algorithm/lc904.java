package Algorithm;

public class lc904 {
    public int totalFruit(int[] tree) {
    	int[] count = new int[tree.length];
    	int start = 0;
    	int type = 0;
    	int res = 0;
        for(int end = 0; end<tree.length; end++) {
        	if(count[tree[end]] == 0) {
        		if(type == 2){
        			// Found a valid substring
        			if(res < end-start) {
        				res = end - start;
        			}
        			// Update the new start
        			while(type == 2) {
        				count[tree[start]]--;
        				if(count[tree[start]]==0) {
        					type--;
        				}
        				start++;
        			}
        		}
        		count[tree[end]] = 1;
        		type ++;
        	}
        	else {
        		count[tree[end]]++;
        	}
        }
        if(type<=2 && res < (tree.length - start)) {
        	res = tree.length - start;
        }
        return res;
    }
}
