public class QueueAddDelete {
    private Node head;
    private Node tail;

    // Inner class representing a node in the linked list
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add an element to the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            // If the queue is empty, set both head and tail to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Append the new node to the end of the queue
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to remove and return the front element from the queue
    public int dequeue() {
        if (head == null) {
            // If the queue is empty, throw an exception
            throw new NoSuchElementException("Queue is empty");
        }

        int data = head.data;

        if (head == tail) {
            // If there is only one node in the queue, set both head and tail to null
            head = null;
            tail = null;
        } else {
            // Move the head to the next node
            head = head.next;
        }

        return data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return head == null;
    }
}
