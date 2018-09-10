package Algorithm;

import java.util.Arrays;

public class lc628 {
    public int maximumProduct(int[] nums) {
    	Arrays.sort(nums);
    	int maxSide = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
    	int minSide = nums[0] * nums[1] * nums[nums.length - 1];
    	
    	return Math.max(maxSide, minSide);
    }
}
