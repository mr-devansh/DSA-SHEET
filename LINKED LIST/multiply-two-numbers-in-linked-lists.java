class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
        long n1 = 0;
        long n2 = 0;
        long mod = 1000000007;
        
        Node temp1 = l1;
        Node temp2 = l2;
        
        while(temp1!=null){
            n1 = (10*n1+(temp1.data))%mod;
            temp1 = temp1.next;
        }
        
        while(temp2!=null){
            n2 = (10*n2+(temp2.data))%mod;
            temp2 = temp2.next;
        }
        
        return (n1*n2)%mod;
   }
}
