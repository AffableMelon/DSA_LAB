import java.util.ArrayList;
class MinStack {
    private int top;
    private int minind;
    private ArrayList<Integer> mins = new ArrayList<Integer>();
    private ArrayList<Integer> stack = new ArrayList<Integer>() ;
    public MinStack() {
        top = -1;
        minind = -1;
    }
    
    public void push(int val) {
        if (minind == -1){
            mins.add(val);
            minind++;
        }else if  (val <= mins.get(minind)){
            mins.add(val);
            minind++;
        }
        ++top;
        stack.add(val);;
    }
    
    public void pop() {
        if ((stack.get(top).equals(mins.get(minind)))){
            mins.remove(minind--);
        }
        stack.remove(top);
        top--;
    }
    
    public int top() {
        return(stack.get(top));
    }
    
    public int getMin() {
        return (mins.get(minind));
    }
}