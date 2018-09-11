package Algorithm;

public class lc659 {
    public boolean isPossible(int[] nums) {
    	int count=0;
    	int p1=0,p2=0,p3=0;
    	for(int i = 0; i< nums.length;i+=count) {
    		if(i!=0 && nums[i]!=nums[i-1]+1) {
    			if(p1 == 0 && p2 == 0) {
    				p3=0;
    			}
    			else {
    				return false;
    			}
    		}
    		count = 0;
    		int c1 = 0, c2 = 0, c3 = 0;
    		while(i+count < nums.length && nums[i+count] == nums[i]) {
    			count++;
    		}
    		if(count<p1+p2) {
    			System.out.println(nums[i] + " " + count);
    			return false;
    		}
    		else {
    			if(count>p1+p2+p3) {
    				c1 = count-p1-p2-p3;
    				c3 = count-p1-c1;
    			}
    			else {
    				c1 = 0;
    				c3 = count-p1;
    			}
    			c2 = p1;
    		}
    		System.out.println(nums[i] + " "+ c1 + " "+ c2 + " "+ c3);
    		p1 = c1;
    		p2 = c2;
    		p3 = c3;
    	}
    	return (p1 == 0 && p2 == 0); 
    }
}
