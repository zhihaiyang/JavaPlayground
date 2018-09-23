package Algorithm;

public class lc35 {
    public int searchInsert(int[] nums, int target) {
    	if(nums == null) {
    		return 0;
    	}
        int min = 0;
        int max = nums.length - 1;
        while(min<=max) {
        	int can = min + (max-min)/2;
        	if(target==nums[can]) {
        		return can;
        	}
        	else if(target<nums[can]) {
        		max = can - 1;
        	}
        	else {
        		min = can + 1;
        	}
        }
        return min;
    }
}
