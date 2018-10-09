package Algorithm;

public class lc698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        boolean[] visited = new boolean[nums.length];
        int total = 0;
        for(int num : nums) {
        	total += num;
        }
        if((total % k) != 0) {
        	return false;
        }
        
        return dfs(nums, visited, 0, 0, k, total/k);
    }
    
    boolean dfs(int[] nums, boolean[] visited, int startIndex, int currentSum, int count, int target) {
    	if(currentSum > target) {
    		return false;
    	}
    	if(currentSum == target) {
    		return dfs(nums, visited, 0, 0, count-1, target);
    	}
    	if(count == 0) {
    		return true;
    	}
    	
    	for(int i = startIndex; i < nums.length; i++) {
    		if(visited[i]==false) {
	    		visited[i] = true;
	    		
	    		if(dfs(nums, visited, i+1, currentSum + nums[i], count, target)) {
	    			System.out.println("index " + i + " returns true");
	    			return true;
	    		}
	    		
	    		visited[i] = false;
    		}
    	}
    	return false;
    }
}
