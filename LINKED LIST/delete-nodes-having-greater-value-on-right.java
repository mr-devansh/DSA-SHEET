class Solution
{
    Node reverse(Node head){    
        if(head==null || head.next==null){
            return head;
        }
        Node temp = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
    Node compute(Node head)
    {
        // your code here
        Node rev = reverse(head);
        Node temp = rev;
        int max = temp.data;
        
        while(temp.next!=null){
            if(max<temp.next.data){
                max = temp.next.data;
                temp = temp.next;
            }
            else{
                temp.next = temp.next.next;
            }
        }
        return reverse(rev);
    }
}
