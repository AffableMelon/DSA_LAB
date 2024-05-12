class NoDe{
    int val;
    NoDe next;

    NoDe(int key)
    {
        this.val = key;
        this.next = null;
    }
}
class QueuLL{
    private NoDe head;
    private NoDe tail;
    int length;

    public int getHeadval(){
        return(head.val);
    }
    public NoDe getHead(){
        return(this.head);
    }
    public NoDe getTail(){
        return(this.tail);
    }
    public int getTailval(){
        return(tail.val);
    }


    public void enq(int num){
        NoDe temp = new NoDe(num);

        if (length == 0){
            tail = head = temp;
            length++;
        }
        tail.next = temp;
        tail = temp;
        
    }


    public void dequ(){
        if (length == 0){
            return;
        }
        head = head.next;
        length -= 1;

        if (head == null)
            tail = null;
    }
    public int peek(){
        return(head.val);
    }

}