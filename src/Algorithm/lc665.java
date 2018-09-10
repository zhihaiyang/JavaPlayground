package Algorithm;

public class lc665 {
    public boolean checkPossibility(int[] nums) {
    	if(nums.length == 1)
    		return true;
        boolean modify = false;
        int i = 1;
        while(i<nums.length) {
        	if(nums[i] < nums[i-1]) {
        		if(!modify && (i==1 || i== nums.length-1 ||(nums[i-2]<=nums[i] || nums[i-1]<=nums[i+1]))) {
        			modify = true;
        		}
        		else {
        			return false;
        		}
        	}
        	i++;
        }
        return true;
    }
}
