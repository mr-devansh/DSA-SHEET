class Solution {
    Node divide(int N, Node head) {
        if (head == null || head.next == null) {
            return head; // No need to modify for empty or single-node list
        }

        Node evenStart = null, evenEnd = null;
        Node oddStart = null, oddEnd = null;

        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = null; // Disconnect the current node

            if (current.data % 2 == 0) {
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = current;
                }
            } else {
                if (oddStart == null) {
                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = current;
                }
            }

            current = next;
        }

        if (evenStart == null || oddStart == null) {
            return head; // No need to modify if there are no even or odd numbers
        }

        evenEnd.next = oddStart;

        return evenStart;
    }
}
