class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node temp = head;
        int arr[] = {0,0,0};
        while(temp!=null){
            arr[temp.data]++;
            temp = temp.next;
        }
        
        int i =0;
        temp = head;
        
        while(temp!=null){
            if(arr[i]==0){
                i++;
            }
            else{
                temp.data = i;
                --arr[i];
                temp = temp.next;
            }
        }
        return head;
    }
}
