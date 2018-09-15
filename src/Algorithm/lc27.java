package Algorithm;

public class lc27 {
    public int removeElement(int[] nums, int val) {
        int end = nums.length-1;
        while(end>=0&&nums[end]==val) {
        	end--;
        }
        if(end == -1)
        	return 0;
        int start = 0;
        while(start<end) {
        	if(nums[start]==val) {
        		nums[start]=nums[end];
        		end--;
        		while(nums[end]==val) {
        			end--;
        		}
        	}
        	start++;
        }
        return end+1;
    }
}
