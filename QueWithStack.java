public class QueWithStack {
        Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);

        void enQue(int num){
            while (!s1.isEmpty()){ 
                s2.pushInto((s1.popOut())); 
            } 
            s1.pushInto(num);

            while (!s2.isEmpty()) { 
                s1.pushInto(s2.popOut()); 
            }
        }

        int deQue(){
            if (s1.isEmpty()){
                return (-1);
            }

            int out = s1.peak();
            s1.popOut();
            return(out);
        
        }
    }

