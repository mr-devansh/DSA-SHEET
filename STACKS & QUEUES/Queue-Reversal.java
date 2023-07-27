class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> stack = new Stack<>();
        
        // Push elements from the queue into the stack.
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        
        // Pop elements from the stack and add them back into the queue.
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        
        return q;
    }
}
