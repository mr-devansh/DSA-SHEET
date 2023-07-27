class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> q2 = new LinkedList<>();

        // Enqueue the first K elements from the original queue into the stack.
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
        }

        // Dequeue the remaining elements from the original queue and enqueue them into q2.
        while (!q.isEmpty()) {
            q2.add(q.poll());
        }

        // Enqueue elements from the stack back into the original queue.
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }

        // Enqueue elements from q2 back into the original queue.
        while (!q2.isEmpty()) {
            q.add(q2.poll());
        }

        return q;
    }
}
