package Algorithm;

import java.util.*;

public class lc84 {
    public int largestRectangleArea(int[] heights) {
    	int[] area = new int[heights.length];
    	LinkedList<Integer> st = new LinkedList<>();
    	int index = 0;
    	while(index<heights.length) {
			while(!st.isEmpty()) {
    			int top = st.peek().intValue();
    			if(heights[top] <= heights[index]) {
    				st.push(index);
    				area[index] += heights[index] * (index-top-1); // left rec area, not inclusive
    				break;
    			}
    			else {
    				st.pop();
    				area[top] += heights[top] * (index-top);// right rec area, self included
    			}
			}
			if(st.isEmpty()) {
				st.push(index);
				area[index] += heights[index] * (index); // left rec area, not inclusive
			}
    		index++;
    	}
    	while(!st.isEmpty()) {
    		index = st.pop().intValue();
    		area[index] += heights[index] * (heights.length - index);// right rec area till end
    	}

    	int result = 0;
    	for(int v : area) {
    		if(v>result) {
    			result = v;
    		}
    	}
    	return result;
    }
}
