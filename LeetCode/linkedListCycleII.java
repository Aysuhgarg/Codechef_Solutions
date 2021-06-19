public class linkedListCycleII {
    
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
        
        if(fast==null || fast.next==null)
        {
            return null;
        }
        
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast)
            {
                break;
            }
        }
        
        if(slow!=fast) return null;
        
        slow=head;
        
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
