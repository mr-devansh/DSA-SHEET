/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution
{
    Node compute(Node head)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data<temp.next.data)
            {
              temp.data=temp.next.data;
              temp.next=temp.next.next;
              temp=head;
              
            }
            else  temp=temp.next;
        }
        return head; 
    }
}
