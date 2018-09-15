package Algorithm;

public class lc83 {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head == null)
    		return null;
        ListNode root = head;
        ListNode prev = head;
        ListNode next = prev.next;
        while(next != null) {
        	if(prev.val != next.val) {
        		prev.next = next;
        		prev = next;
        	}
        	next = next.next;
        	
        }
        prev.next = null;
        return root;
    }
}
