package Algorithm;

public class lc845 {
    public int longestMountain(int[] A) {
    	if(A == null || A.length<3) {
    		return 0;
    	}
        int start = 0;
        int end = 1;
        int length = 0;
        while(start+3 <= A.length) {
        	boolean up = false;
        	boolean down = false;
        	end = start+1;
        	while(end<A.length) {
        		if(A[end]==A[end-1]) {
        			break; // a valid may found
        		}
        		else if(A[end] > A[end-1]) {
        			if(down) {// a valid found
        				break;
        			}
        			up = true;
        		}
        		else {
        			if(!up) {
        				break;//invalid
        			}
        			down = true;
        		}
        		end++;
        	}
        	if(up && down) {
        		//System.out.println("Found [" + start + "," + (end-1) + "]");
        		if(length == 0 || length<(end-start)) {
        			length = end - start;
        		}
        	}
        	if(end < A.length && A[end]>A[end-1]) {
        		start = end - 1;
        	}
        	else {
        		start = end;
        	}
        }
        return length;
    }
}
