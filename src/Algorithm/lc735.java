package Algorithm;

import java.util.*;

public class lc735 {
    public int[] asteroidCollision(int[] asteroids) {
    	LinkedList<Integer> res = new LinkedList<>();
        for(int num:asteroids) {
        //	System.out.println(res);
        //	System.out.println(num);
        	boolean col = false;
        	while(!res.isEmpty()) {
        		int top = res.peek();
        		if(num * top > 0) {
        			res.push(num);
        			break;
        		}
        		else {
        			if(num < 0) {
        				if(Math.abs(num) > Math.abs(top)){
	        				res.pop();
	        				continue;
        				}
        				else if(Math.abs(num) == Math.abs(top)) {
        					res.pop();
        					col = true;
        					break;
        				}
        				else {
        					break;
        				}
        			}
        			else {
        				res.push(num);
        				break;
        			}
        		}
        	}
        	if(!col && res.isEmpty()) {
        		res.push(num);
        	}
        }
    
		int[] result = new int[res.size()];
		int i = res.size()-1;
		for(Integer num:res) {
			result[i] = num.intValue();
			i--;
		}
		return result;
    }

}
