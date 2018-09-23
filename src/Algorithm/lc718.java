package Algorithm;

public class lc718 {
    public int findLength(int[] A, int[] B) {
    	int[][] count = new int[2][B.length];
    	int len = 0;
    	for(int i = 0; i< A.length;i++) {
    		for(int j = 0; j<B.length;j++) {
    			if(A[i]!=B[j]) {
    				count[i%2][j]=0;
    			}
    			else {
    				if(i==0||j==0) {
    					count[i%2][j]=1;
    				}
    				else {
    					count[i%2][j]=count[(i-1)%2][j-1]+1;
    				}
    				if(len<count[i%2][j]) {
    					len = count[i%2][j];
    				}
    			}
    		}
    	}
    	
    	return len;
    }
}
