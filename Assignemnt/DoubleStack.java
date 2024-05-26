package Assignment;
class Stack {
    private DoubleeLL dll;

    Stack() {
        this.dll = new DoubleeLL();
    }

    public void push(int num) {
        dll.frontAdd(num);
    }

    public int pop() {
        if (dll.getHead() == null) {
            System.out.println("Stack is empty");
        }
        int value = dll.getHead().val;
        dll.deleteAtPosition(1);
        return value;
    }

    public int peek() {
        if (dll.getHead() == null) {
            System.out.println("Stack is empty");
        }
        return dll.getHead().val;
    }

    public boolean isEmpty() {
        return dll.getHead() == null;
    }

    public void display() {
        if (dll.getHead() == null) {
            System.out.println("Stack is empty");
            return;
        }
        dll.showList();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Test push() method
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.print("Stack after push(): ");
        stack.display(); // Expected output: 3, 2, 1

        // Test pop() method
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Expected output: 3
        System.out.print("Stack after pop(): ");
        stack.display(); // Expected output: 2, 1

        // Test peek() method
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Expected output: 2

        // Test isEmpty() method
        boolean empty = stack.isEmpty();
        System.out.println("Is stack empty? " + empty); // Expected output: false

        poppedElement = stack.pop(); 
        System.out.println("Popped element: " + poppedElement); // Expected output: 2
        System.out.print("Stack after pop(): ");
        stack.display(); // 1 

        topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        stack.pop(); // remove last element
        System.out.print("Stack after pop(): ");
        stack.display(); // Expected output: Stack is empty

        // Test isEmpty() method on empty stack
        empty = stack.isEmpty();
        System.out.println("Is stack empty? " + empty); // Expected output: true
    }
}
