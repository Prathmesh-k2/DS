public class LinkeL {
    static  class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack {
        static Node head=null;

        //check is empaty;
        public static boolean isEmpty(){
            return head==null;
        }
        //push-> add
        public static void push( int data){
            Node newnode = new Node(data);
          
            newnode.next =head;
            head=newnode;
        }
        //pop remove 1st element
        public static int  Pop(){
             if(isEmpty()){
                return -1 ;
            }
            int top = head.data;
            head=head.next;
            return top;
        }
        //peek 
        public static int Peek(){
             if(isEmpty()){
                return -1 ;
            }
            int top = head.data;
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
