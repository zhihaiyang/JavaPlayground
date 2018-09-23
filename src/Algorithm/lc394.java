package Algorithm;

import java.util.*;

public class lc394 {
    public String decodeString(String s) {
        LinkedList<String> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int number = 0;
        for(int i = 0; i < s.length(); i++) {
        	if(Character.isLetter(s.charAt(i))) {
        		sb.append(s.charAt(i));
        	}
        	else if(Character.isDigit(s.charAt(i))) {
        		if(sb.length()!=0) {
        			stack.push(sb.toString());
        			sb.setLength(0);;
        		}
        		number *= 10;
        		number += Character.getNumericValue(s.charAt(i));
        	}
        	else if(s.charAt(i) == '[') {
        		stack.push(Integer.toString(number));
        		number = 0;
        	}
        	else {//if(s.charAt(i) == ']') 
        		String top = stack.pop();
        		//System.out.println("i:" + i + ", pop: " + top);
        		int multi = Integer.parseInt(top);
    			String str = sb.toString();
        		while(multi>1) {
        			sb.append(str);
        			multi--;
        		}
        		//System.out.println(sb.toString());
        		if(!stack.isEmpty()) {
        			String t = stack.peek();
        			if(!Character.isDigit(t.charAt(0))) {
        				sb.insert(0, stack.pop());
        			}
        		}
        	}
        }
        return sb.toString();
    }
}
