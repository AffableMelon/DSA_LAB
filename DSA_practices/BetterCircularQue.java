public class CircularQue {
        private int size, front, rear;
        private int[] queue;

        CircularQue(int size){
            this.size = size;
            queue = new int[size];
            this.front = this.rear = -1;
        }
    

    public void enQueue(int data)
    {
        if(front == -1 && rear == -1)
        {
            front = 0;
            rear = 0;
            queue[rear] = data;
            return;
        }

        rear = (rear + 1) % queue.length;
        
        if(rear == front)
        {
            System.err.println("Queue Full");
            return;
        }

        queue[rear] = data;
    }
    public int deQueue()
    {
        int temp;

        if(front == rear )
        {
            System.out.print("Queue is Empty");
            
            return -1; 
        }

        temp = queue[front];

        this.front = (this.front + 1) % queue.length;
        
        return temp;
    }
    public void displayQueue(){
        int temp = front;
        if(temp == rear)
            {
                System.out.print("Queue is Empty");
                return;
            }

        while(temp != rear){
                System.out.printf(" %d", queue[temp] );
                temp = (temp + 1)  % size;
        }
        System.out.printf(" %d", queue[temp] ); 
        System.out.println();

    }
}
