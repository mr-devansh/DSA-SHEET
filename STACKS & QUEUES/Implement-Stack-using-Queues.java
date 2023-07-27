
class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        if (q1.isEmpty()) {
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.remove();
            }
        } else {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.peek());
                q1.remove();
            }
        }
    }

    public int pop() {
        if (q1.isEmpty()) {
            return q2.remove();
        } else {
            return q1.remove();
        }
    }

    public int top() {
        if (q1.isEmpty()) {
            return q2.peek();
        } else {
            return q1.peek();
        }
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
