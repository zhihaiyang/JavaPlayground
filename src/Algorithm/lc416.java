package Algorithm;

public class lc416 {
	
	public boolean canPartition_dp(int[] nums) {
		int total = 0;
		for(int num : nums) {
			total += num;
		}
		if(total %2 == 1) {
			return false;
		}
		
		boolean[][] canSum = new boolean[nums.length + 1][total/2 + 1];
		for(int i = 0;i<canSum.length;i++) {
			canSum[i][0] = true;
		}
		for(int i = 1;i<canSum[0].length;i++) {
			canSum[0][i] = false;
		}
		
		for(int i = 1; i <= nums.length; i++) {
			for(int j = 1;j<total/2+1;j++) {
				if(canSum[i-1][j] == true) {
					canSum[i][j] = true;
				}
				else {
					if(j>=nums[i-1]) {
						canSum[i][j] = canSum[i-1][j-nums[i-1]];
					}
					else {
						canSum[i][j] = false;
					}
				}
				System.out.println("total" + i + "packets, sum:" + j + "result " + canSum[i][j]);
			}
		}
		return canSum[nums.length][total/2];
	}
	
    public boolean canPartition_dfs(int[] nums) {
        int total = 0;
        for(int num: nums) {
        	total += num;
        }
        if(total%2 == 1)
        	return false;
        boolean[] visited = new boolean[nums.length];
        return dfs(nums, visited, 0, 0, total/2);
    }
    
    boolean dfs(int[] nums, boolean[] visited, int startIndex, int currentSum, int target) {
    	if(currentSum > target) {
    		return false;
    	}
    	if(currentSum == target) {
    		return true;
    	}
    	if(startIndex >= nums.length) {
    		return false;
    	}
    	for(int i = startIndex; i < nums.length; i++) {
    		if(visited[i] == false) {
    			visited[i] = true;
    			if(dfs(nums, visited, i+1, currentSum+nums[i], target)) {
    				return true;
    			}
    			visited[i] = false;
    		}
    	}
    	return false;
    }
}
