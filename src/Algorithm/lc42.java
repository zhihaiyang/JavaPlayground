package Algorithm;

import java.util.LinkedList;

public class lc42 {
    public int trap(int[] height) {
        LinkedList<Integer> stack = new LinkedList<>();
        int area = 0;
        int index = 0;
        while(index < height.length) {
        	if(stack.isEmpty() || height[index] <= height[stack.peek()]) {
        		stack.push(index);
        		index++;
        	}
        	else {
        		int bottom = stack.pop();
        		area += stack.isEmpty()? 0 : (Math.min(height[stack.peek()],height[index]) - height[bottom]) * (index - stack.peek() -1);
        	}
        }
        return area;
    }
}
