public class Stack{
    private int maxSize;
    private int top = -1;
    int [] numArray;

    Stack(int size){
        maxSize = size;
        numArray = new int[maxSize];
    }
    int size(){
        if (top >= 0){
            return(top+1);
        }
        else{
            return(-1);
        }

    }
    void pushInto (int num){
        if (top < maxSize-1){
            numArray[top + 1] = num;
            top++;
        }
        else
            System.err.println("Stack is full");
    }

    int popOut (){
        if (top >= 0){
            int temp = numArray[top--];
            return(temp);
        }
        else{
            return(-1);
        }
    }
    int peak(){
        if (top >= 0){
            return(numArray[top]);
        }else{
            return(-1);
        }
    }
    boolean isFull(){
        return(top == maxSize-1);
    }
    boolean isEmpty(){
        return(top == -1);
    }
}