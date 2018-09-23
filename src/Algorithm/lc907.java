package Algorithm;

import java.util.*;

public class lc907 {
	class Node{
		int val;// index of min
		int left;
		int right;
		Node l;
		Node r;
		
		Node(int val, int left, int right){
			this.val = val;
			this.left = left;
			this.right = right;
			l = null;
			r = null;
		}
	}
    public int sumSubarrayMins_v2(int[] A) {
    	LinkedList<Integer> stack = new LinkedList<>();
    	
        int count = 0;
        for(int j = 0; j <= A.length; j++) {
			while(!stack.isEmpty() && (j == A.length || A[j] < A[stack.peek()])) {
				int min = stack.pop();
				int left = stack.isEmpty() ? 0 : stack.peek() + 1;

        		System.out.println("left : " + left + "right: " + j + "count+" + (j-left));
				int width = (j - min) * (min - left + 1);
				count += width * A[min];
				count %= 1000000007;
			}
			if(j < A.length) {
				stack.push(j);	
			}
        }

        return count;
    }
    
    public int sumSubarrayMins(int[] A) {
        Node root = buildTree(A, 0, A.length-1);
        int count = 0;
        for(int j = 0;j<A.length;j++) {
        	int left = 0;
        	while(left <= j) {
        		int min = findMin(root, left, j, A);
        		System.out.println("left : " + left + "right: " + j + "count+" + (min-left+1));
        		count += (min-left+1)*A[min];
        		count %= 1000000007;
        		left = min + 1;
        	}
        }
        return count;
    }
    
    int findMin(Node root, int left, int right, int[] A) {
    	if(root.left == left && root.right == right) {
    		return root.val;
    	}
    	int mid = root.left +(root.right-root.left)/2;
    	if(right<=mid) {
    		return findMin(root.l, left, right, A);
    	}
    	else if(left>mid) {
    		return findMin(root.r, left, right, A);
    	}
    	else {
    		int minl = findMin(root.l, left, mid, A);
    		int minr = findMin(root.r, mid+1, right, A);
    		if(A[minl] < A[minr]) {
    			return minl;
    		}
    		else {
    			return minr;
    		}
    	}
    }
    
    //build tree
    Node buildTree(int[] A, int left, int right) {
    	if(left == right) {
    		return new Node(left, left, right);
    	}
    	int mid = left + (right-left)/2;
    	Node l = buildTree(A, left, mid);
    	Node r = buildTree(A, mid+1, right);
    	
    	Node root = new Node((A[l.val] < A[r.val] ? l.val : r.val), left, right);
    	root.l = l;
    	root.r = r;
    	return root;
    }
}
