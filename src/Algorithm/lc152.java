package Algorithm;

public class lc152 {
	
	int max(int a, int b, int c) {
		return Math.max(c, Math.max(a, b));
	}
	
	int min(int a, int b, int c) {
		return Math.min(c, Math.min(a, b));
	}
	
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        
        for(int i = 1; i<nums.length;i++) {
        	int tempMax = max(min*nums[i], max*nums[i], nums[i]);
        	int	tempMin = min(min*nums[i], max*nums[i], nums[i]);
        	if(tempMax>result) {
        		result = tempMax;
        	}
        	max = tempMax;
        	min = tempMin;
        }

        return result;
    }
}
