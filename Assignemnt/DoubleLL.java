package Assignment;


class ND {
    int val;
    ND prev;
    ND next;

    ND(int num){
        this.val = num;
        this.next = null;
    }
}
class DoubleeLL{
    private ND head;
    private ND tail;
    int length;


    DoubleeLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public ND getHead() {
        return head;
    }

    public ND getTail() {
        return tail;
    }

    public void frontAdd(int num){

        ND somenode = new ND(num);
        this.length++;
        if(this.head == null){
            this.head = somenode;
            this.tail = somenode;
            return;
        }
        this.head.prev = somenode; //take our head's prev pointer and point to new node
        somenode.next = this.head; // make new node next point to old head
        this.head = somenode; // make head node the new node
    }

    public void backAdd(int num){
        ND somenode = new ND(num);
        this.length++;
        if(this.head == null){
            this.head = somenode;
            this.tail = somenode;
            return;
        }
        this.tail.next = somenode; // take our tail's next pointer and point to new node
        somenode.prev = tail; // make the new mode previous point to the old tail
        tail = somenode; // update the tail to the new node

    }

    public void insertAtNode(int index, int num){
        if(index > length || index == 0){
            System.out.println("Sorry that index doesn't exit");
        }else if (index == 1){
            frontAdd(num);
        }else if (index == length){
            backAdd(num);
        }else{
            length++;
            int i = 1;
            ND tempHead = head;
            ND insert = new ND(num);
            while( i < index){
                tempHead = tempHead.next;
                i++;
            }
            insert.next = tempHead; // new node points to the position
            insert.prev = tempHead.prev; // new node points to the position b4
            tempHead.prev.next = insert; // set the preivous' next link to new node
            tempHead.prev = insert; // set the positioned node's previous be the new node

        }

    }

    public void deleteAtPosition(int pos){
        if (pos > length){
            System.out.println("Not a valid position");
        }
        else{
            length--;
            int i = 1;
            ND temp = head;
            if (pos == 1){
                head = head.next;
                return;
            }
            while( i < pos){
                temp = temp.next;
                i++;
            }
            temp.next.prev = temp.prev; // update the link of the front's node to the one behind the node we want out
            temp.prev.next = temp.next; //update the link of the previous's node to the one after the removed
        }
    }

    public boolean searchLL(int target){
        boolean found = false;

        ND temp = head;
        while(temp.next != null){
            if (found){
                break;
            }
            found = (temp.val == target) ? true:false;
            temp = temp.next;
        }

        return(found);
    }

    public void deleteAfterNode(ND node){
        if (node == null || node.next == null){
            System.out.println("Not in list");
            return;
        }
        
        ND nextNode = node.next;
        node.next = nextNode.next;
        
        if (nextNode.next != null){
            nextNode.next.prev = node;
        } else {
            tail = node;
        }
        
        length--;
    }

    public void showList(){
        ND temp = head;
        if (head == null){
            System.out.println("empty");
        }
        while(temp.next != null){
            System.out.printf("%d, ", temp.val);
            temp = temp.next;
        }
        System.out.printf("%d ", temp.val);
        System.out.println();
    }


}

class testLL{
    public static void main(String[] args) {
        DoubleeLL linkedLL = new DoubleeLL();
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

        System.out.println(linkedLL.length);

        System.out.println(linkedLL.searchLL(89));
        System.out.println(linkedLL.searchLL(100));

        linkedLL.showList();

        linkedLL.insertAtNode(12, 0);
        linkedLL.insertAtNode(4, 100);
        System.out.println(linkedLL.searchLL(89));
        System.out.println(linkedLL.searchLL(100));
        System.out.println();
        linkedLL.deleteAfterNode(linkedLL.getTail());


        linkedLL.showList();


        linkedLL.deleteAtPosition(1);
        System.out.println(linkedLL.searchLL(89));
        System.out.println(linkedLL.searchLL(100));
        linkedLL.deleteAtPosition(3);
        System.out.println(linkedLL.searchLL(89));
        System.out.println(linkedLL.searchLL(100));

        linkedLL.showList();
    }
}