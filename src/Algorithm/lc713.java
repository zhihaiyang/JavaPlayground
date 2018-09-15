package Algorithm;

public class lc713 {
	// As long as there is a valid case, it should be counted. Not wait till found the invalid case, then sum up.
    public int numSubarrayProductLessThanK_v1(int[] nums, int k) {
    	if(k==0)
    		return 0;
        int start = 0;
        int end = -1;
        int count = 0;
        int product = -1;
        while(end <= nums.length&&start<nums.length) {
    		if(product >= k || end == nums.length) {
    			//Found a boundary
    			System.out.println("start: " + start + ", end: " + end);
    			count += end-start<=0 ? 0 : (end-start);
    			product /= nums[start];
    			start++;
    		}
    		else {
    			if(start>end) {
    				end = start;
    				product = nums[end];
    			}
    			else {
	    			end++;
	    			if(end<nums.length){
	    				product *= nums[end];
	    			}
    			}
    		}
        }
        return count;
    }
    
    // Count as long as there is an valid end found.(including end itself)
    public int numSubarrayProductLessThanK_v2(int[] nums, int k) {
    	if(k==0)
    		return 0;
        int start = 0;
        int end = 0;
        int count = 0;
        int product = 1;
        while(end < nums.length) {
        	product *= nums[end];
    		while(product >= k && start<=end) {
    			System.out.println("start: " + start + ", end: " + end);
    			product /= nums[start];
    			start++;
    		}
    		// Found the start boundary for the given end
    		count += end-start+1;
    		end++;
        }
        return count;
    }
}
