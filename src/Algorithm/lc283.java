package Algorithm;

public class lc283 {
    public void moveZeroes(int[] nums) {
        int cur = 0;
        for(int num:nums) {
        	if(num!=0) {
        		nums[cur]=num;
        		cur++;
        	}
        }
        for(int i = cur;i<nums.length;i++) {
        	nums[i] = 0;
        }
    }
}
