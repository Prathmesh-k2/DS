import java.util.*;

public class ArrayL {
   static  class Stack{
       static  ArrayList<Integer> List = new ArrayList<>();

        //check empaty;
         public  static boolean isEmpty(){
            if(List.size()==0){ 
            return  true;
            }
            else{
                return false;
            }
        }
        //push
         public static  void push(int data){
            List.add(data);
        }
        //pop
        public static  int  Pop(){
            if(isEmpty()){
                return -1;
            }
            int top= List.get(List.size()-1);
            List.remove(List.size()-1);
            return top;
        }
        //peek
        public static  int Peek(){
             if(isEmpty()){
                return -1;
            }
             int top= List.get(List.size()-1);
             return top;
        }

    }

    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
     while(!s.isEmpty()) {
    System.out.println(s.Peek());
    s.Pop();
}
        
    }
}
