package Algorithm;

public class lc905 {
    public int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length-1;
        while(end>=0 && (A[end]&1) == 1) {
        	end--;
        }
        for(;start<end;start++) {
        	if((A[start]&1)==0) {
        		continue;
        	}
        	else {
        		int temp = A[start];
        		A[start]=A[end];
        		A[end]=temp;
        		end--;
        		while(end>start && (A[end]&1) == 1) {
        			end--;
        		}
        	}
        }
        return A;
    }
}
