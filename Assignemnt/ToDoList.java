package Assignment;


class Task{
    private String title;
    private String description;
    private boolean completed;
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void marckCompleted(boolean completed) {
        this.completed = completed;
    }

}
class Node{
    Task task;
    Node next;
    Node prev;
    public Node(Task task) {
        this.task = task;
        this.next = null;
        this.prev = null;
    }
}
public class ToDoList{
    private Node head;
    private Node tail;
    ToDoList(){
        this.head = null;
        this.tail = null;
    }

    public void addToDo(Task task){
        Node toadd = new Node(task);
        if (head == null){
            head = toadd;
            tail = toadd;
        }else{
            toadd.prev = tail;
            tail.next = toadd;
            tail = toadd;
        }
    }
    
    public void markToDoAsComplete(String title){
        Node walk = head;
        while (walk.next != null){
            if(walk.task.getTitle().equals(title)){
                walk.task.marckCompleted(true);
                break;
            }
            walk = walk.next;
        }
        if(walk.task.getTitle().equals(title)){
            walk.task.marckCompleted(true);
        }
    }

    public void viewToDoList(){
        Node walk = head;
        while(walk.next != null){
            System.out.println("Title: " + walk.task.getTitle());
            System.out.println("Description: " + walk.task.getDescription());
            System.out.println("Completed: " + walk.task.isCompleted());
            System.out.println();
            walk = walk.next;
        }
        System.out.println("Title: " + walk.task.getTitle());
        System.out.println("Description: " + walk.task.getDescription());
        System.out.println("Completed: " + walk.task.isCompleted());
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a ToDoList object
        ToDoList todoList = new ToDoList();

        // Create some tasks
        Task task1 = new Task("Task a", "Description of task a");
        Task task2 = new Task("Task b", "Description of task b");
        Task task3 = new Task("Task c", "Description of task c");

        // Test addToDo() method
        todoList.addToDo(task1);
        todoList.addToDo(task2);
        todoList.addToDo(task3);

        // Test markToDoAsComplete() method
        todoList.markToDoAsComplete("Task 2");
        todoList.markToDoAsComplete("Task c");


        // Test viewToDoList method

        todoList.viewToDoList();
    }
}