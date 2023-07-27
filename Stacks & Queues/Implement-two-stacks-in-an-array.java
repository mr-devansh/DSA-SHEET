
class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //print arr
    void print(int arr[], int x, int y){
        int i = 0;
        for(i =x; i< y; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
        if(top1 >= -1 && top1<(size/2)-1){
            top1++;
            arr[top1] = x;
        }
    }
    
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if(top2>size/2 && top2<=size){
            top2--;
            arr[top2] = x;
        }
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {
        if(top1!=-1){
            int val = arr[top1];
            top1--;
            return val;
        }
        else{
            return -1;
        }
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {
        if(top2<size){
            int val = arr[top2];
            top2++;
            return val;
        }
        else{
            return -1;
        }
    }
}

