public static Node reverseDLL(Node  head)
{
    Node curr=head;
    Node right=head.next;
    
    curr.next = null;
    curr.prev = right;
    
    while(right!=null){
        right.prev = right.next;
        right.next = curr;
        curr = right;
        right = right.prev;
    }
    return curr;
}
