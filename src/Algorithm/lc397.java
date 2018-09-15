package Algorithm;

public class lc397 {
    public int integerReplacement(int n) {
    	if(n==1) {
    		return 0;
    	}
    	if((n&1) == 0) {
    		return 1 + integerReplacement(n>>1);
    	}
    	else if(n==Integer.MAX_VALUE) {
    			return integerReplacement(n-1);
    	}
    	else {
    		return 1 + Math.min(integerReplacement(n+1), integerReplacement(n-1));	
    	}
    }
}
