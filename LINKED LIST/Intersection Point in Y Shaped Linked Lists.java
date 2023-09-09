class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
        Node temp1 = head1;
        Node temp2 = head2;
        int size1 = 0;
        int size2 = 0;
        while(temp1!=null){
            size1++;
            temp1 = temp1.next;
        }
        while(temp2!=null){
            size2++;
            temp2 = temp2.next;
        }
        int diff = Math.abs(size1-size2);
        temp1 = head1;
        temp2 = head2;
        int i =0;
        if(size1>size2){
            while(i < diff){
                temp1 = temp1.next;
                i++;
            }
        }else{
            while(i < diff){
                temp2 = temp2.next;
                i++;
            }
        }
        while(temp1!=null){
            
            if(temp1==temp2){
                return temp1.data;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return -1;
	}
}
