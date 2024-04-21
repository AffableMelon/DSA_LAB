import java.util.Arrays;

public class QueueTest {
    public static void main(String[] args) {
        // Create a queue of size 5
        QueueLinear queue = new QueueLinear(5);

        // Test isEmpty() on an empty queue
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected output: true

        // Test isFull() on an empty queue
        System.out.println("Is queue full? " + queue.isFull()); // Expected output: false

        // Test enq() on an empty queue
        queue.enq(10);
        queue.enq(20);
        queue.enq(30);
        System.out.println("Queue after enqueuing 10, 20, 30: " + Arrays.toString(queue.numArray)); // Expected output: [10, 20, 30, 0, 0]

        // Test peak() on a non-empty queue
        System.out.println("Front element of the queue: " + queue.peak()); // Expected output: 10

        // Test deque() on a non-empty queue
        int dequeuedElement = queue.deque();
        System.out.println("Dequeued element: " + dequeuedElement); // Expected output: 10
        
        // Test isEmpty() on a non-empty queue
        System.out.println("Is queue empty? " + queue.isEmpty()); // Expected output: false

        // Test isFull() on a full queue
        queue.enq(40);
        queue.enq(50);
        System.out.println("Is queue full? " + queue.isFull()); // Expected output: true

        // Test enq() on a full queue
        queue.enq(60); // This should print "Queue full dawg"

        // Test deque() on an empty queue
        queue.deque();
        queue.deque();
        queue.deque();
        System.out.println("Dequeued element: " + queue.deque()); // Expected output: -1
    }
}