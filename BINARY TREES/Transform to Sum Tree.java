class Solution{
    int temp=0;
    
    public int solve(Node root){
        if(root==null){
            return 0;
        }
        
        int left=solve(root.left);
        int right=solve(root.right);
        
        temp=root.data;
        root.data=left+right;
        return temp+left+right;
        
    }
    public void toSumTree(Node root){
         solve(root);
    }
}
