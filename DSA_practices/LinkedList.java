class ND{
    int val;
    ND prev;
    ND next;

    ND(int num){
        this.val = num;
        this.next = null;
    }
}

class LL{
    private ND head;
    private ND tail;
    int length;

    LL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void frontAdd(int num){
        ND somenode = new ND(num);
        this.length++;
        if(this.head == null){
            this.head = somenode;
            this.tail = somenode;
            return;
        }
        // somenode.next = this.head;
        // this.head.prev = somenode;
        // this.head = somenode;
        this.head.prev = somenode;
        somenode.next = this.head;
        this.head = somenode;
    }

    public void backAdd(int num){
        ND somenode = new ND(num);
        this.length++;
        if(this.head == null){
            this.head = somenode;
            this.tail = somenode;
            return;
        }
        this.tail.next = somenode;
        somenode.prev = tail;
        tail = somenode;

    }
    public void addBefore(int target, int num){
        ND temp = head;
        
    }
    public void addAfter(int target, int num){
        ND temp = head;
        ND somenode = new ND(num);

        while (temp.next != null){
            if (temp.val == target){
                length++;
                somenode.prev = temp;
                somenode.next = temp.next;
                (temp.next).prev = somenode;
                temp.next = somenode;
                return;
            }
            temp = temp.next;
        }
        if (temp.val == target){
            length++;
            backAdd(num);
        }
        else{
            System.out.println("Not in list");
        }

    }
    public void showList(){
        while(head.next != null){
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println(head.val);
    }
}

class testLL{
    public static void main(String[] args) {
        LL linkedLL = new LL();
        linkedLL.frontAdd(5);
        linkedLL.frontAdd(6);
        linkedLL.frontAdd(7);
        linkedLL.frontAdd(8);
        linkedLL.frontAdd(9);
        linkedLL.backAdd(0);
        linkedLL.backAdd(1);
        linkedLL.backAdd(2);
        linkedLL.backAdd(3);
        linkedLL.backAdd(4);
        System.out.println(linkedLL.length);

        linkedLL.addAfter(8, 89);
        System.out.println(linkedLL.length);

        linkedLL.showList();
    }
}