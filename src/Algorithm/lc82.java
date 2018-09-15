package Algorithm;

public class lc82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev= null, cur= head,root=new ListNode(0);
        prev = root;
        prev.next = head;
        while(cur != null) {
        	while(cur.next != null && cur.val == cur.next.val) {
        		cur = cur.next;
        	}
        	if(prev.next != cur) {
        		prev.next = cur.next;
        	}
        	else {
	    		prev = prev.next;
        	}
        	cur = cur.next;
        }
        return root.next;
    }
}
