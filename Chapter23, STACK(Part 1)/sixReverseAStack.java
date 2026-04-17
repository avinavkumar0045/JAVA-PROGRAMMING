import java.util.*; 

public class sixReverseAStack {
    public static void ReverseStack(Stack<Integer> s){
        if(s.isEmpty()){           
            return;
        }
        int top = s.pop();
        ReverseStack(s);
        PushAtBottom(s, top); // recall krte krte empty tak pahuche      
    }
    // Copies from earlier program
    public static void  PushAtBottom(Stack<Integer> s, int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        PushAtBottom(s, val); // recall krte krte empty tak pahuche. Space complexity  ---> O(n) , so O(n) * n times 
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        S.push(5);

        ReverseStack(S);
        System.out.println("Stack after Reversing ");

        while(!S.isEmpty()){
            System.out.println(S.pop());
        }
    }
    
}
