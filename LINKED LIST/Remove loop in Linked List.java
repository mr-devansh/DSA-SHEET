class Solution
{
    // detect whether the loop exist
      public static Node detectCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(slow!=null&&fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
             if(slow==fast) return slow;
        }
        return null;
       
    }
    
    //Find where the loop starts
    public static Node findFirstNode(Node head){
        //code here
        
        Node start = head;
        Node meet = detectCycle(head);
        if(meet==null) return null;
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return meet;
    }
    // removing loop main function
    public static void removeLoop(Node head){
        if(head==null) return;
       Node meet = findFirstNode(head);
       if(meet==null) return;
       Node previous = meet;
       while(previous.next!=meet) previous=previous.next;
       previous.next=null;
    }
}
