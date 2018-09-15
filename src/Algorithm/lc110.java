package Algorithm;



public class lc110 {
    public boolean isBalanced(TreeNode root) {
        return getLevel(root)>=0;
    }
    
    int getLevel(TreeNode node) {
    	if(node == null) {
    		return 0;
    	}
    	int l = getLevel(node.left);
    	if(l==-1) {
    		return -1;
    	}
    	int r = getLevel(node.right);
    	if(r==-1) {
    		return -1;
    	}
    	if(Math.abs(r-l)<=1) {
    		return 1+ Math.max(l, r);
    	}
    	else {
    		return -1;
    	}
    }
}
