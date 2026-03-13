import java.util.*;
public class stack {

    //pushAtBootom;
    public static void pushAtBottom(Stack <Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
 
         int top = s.pop();
         pushAtBottom(s, data);
         s.push (top);
    }

    //reverse string using stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx =0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
            
        }
        StringBuilder result = new StringBuilder("") ;
        while (!s.isEmpty()) {
            char curr=s.pop();
            result.append(curr);

        }
        return result.toString();
    }

    //reverse stack
    public static void reverseStack(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
   
          public static void main(String[] args) {
            Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
//      while(!s.isEmpty()) {
//     System.out.println(s.peek());
//     s.pop();
 
// }
   String name ="prathmesh";
    System.out.println(reverseString(name));
   
    reverseStack(s);
     while (!s.isEmpty()) {
        System.out.println(s.pop());
        
    }
    
    
}
}
