import java.util.*;
public class fourPushAtTheBottomOfStack {
    // sabse phele sab ko nikalo and then val ko put karo and fir se waise hi sab ko wapis put kar do (Stack)

    // the time complexity is O(1).
    // the space complexity is O(1) as we are not using any stack , but due to recursion there is another stack formed in the background 
    // which has space complexity of O(n), which makes the space complexity to O(n).

    public static void  PushAtBottom(Stack<Integer> s, int val){ 
        if(s.isEmpty()){
            s.push(val);
            return;
        }

        int top = s.pop();
        PushAtBottom(s, val); // recall krte krte empty tak pahuche 
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        PushAtBottom(s,4); 

        while(!s.isEmpty()){
            System.out.println(s.pop());

        }         
    }  
}
