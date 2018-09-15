package Algorithm;

public class lc142 {
    public boolean hasCycle(ListNode head) {
        ListNode s=head,f=head;
        while(s!=null&&f!=null){
            s = s.next;
            f = f.next;
            if(f==null) {
            	return false;
            }
            f = f.next;
            if(s==f){
                break;
            }
        }
        return !(s==null||f==null);
    }
    
    public ListNode detectCycle(ListNode head) {
    	if(head == null) {
    		return null;
    	}
        ListNode p1=head,p2=head;
        while(p1!=null&&p2!=null) {
        	p1=p1.next;
        	p2=p2.next;
        	if(p2 == null) {
        		return null;
        	}
        	p2=p2.next;
        	if(p1==p2) {
        		break;//found
        	}
        }
        if(p1==null||p2==null) {
        	return null;
        }
        p1=head;
        while(p1!= p2) {
        	p1=p1.next;
        	p2=p2.next;
        }
        return p2;
    }
}
