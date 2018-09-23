package Algorithm;

public class lc209 {
    public int minSubArrayLen(int s, int[] nums) {
    	int length = -1;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end <= nums.length) {
        	while(sum < s && end < nums.length) {
        		sum += nums[end];
        		end++;
        	}
        	if(sum >= s) {
        		while(sum >= s && start <= end) {
        			sum -= nums[start];
        			start++;
        		}
        		if(length == -1 ||(length>end-start+1)) {
        			length = end-start+1;
        		}
        	}
        	else {
        		break;
        	}
        }
        return length<0?0:length;
    }
}
