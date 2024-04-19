public class TestStack {
    public static void main(String[] args) {
        Stack numStack = new Stack(5);
        numStack.pushInto(11);
        numStack.pushInto(22);
        numStack.pushInto(33);
        numStack.pushInto(44);
        numStack.pushInto(55);

        int c = numStack.popOut();
        int d = numStack.popOut();
        System.out.println(c); System.out.println(d);
        for (int i = 0; i < numStack.size(); i++){
            System.out.println(numStack.numArray[i]);
        }

    }
    
}
