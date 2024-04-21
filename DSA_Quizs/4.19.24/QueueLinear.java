public class QueueLinear {
    private int front;
    private int populate;
    private int tickets;
    int[] numArray;


    QueueLinear(int size){
        tickets = size;
        numArray = new int[size];
        populate = 0;
        front = 0;
    }

    boolean isEmpty(){
        return(populate == 0);
    }
    boolean isFull(){        
        return(populate == tickets);

    }

    int peak(){
        return(numArray[front]);
    }

    void enq(int num){
        if (populate < tickets){
            numArray[populate++] = num;
        }else{
            System.out.println("Queue full dawg");
        }
    }

    int deque(){
        if (populate > 0){
            return(numArray[front++]);
        }else{
            return(-1);
        }
        
    }
}
