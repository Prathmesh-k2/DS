
public class  LinkedList{
     class Node{
    int data;
    Node next;

    public Node(int data){
    
        this.data=data;
        this.next=null;
    }
}
    public static Node head;
    public static Node tail;
    public static int size;

    public  void addFirst(int data){
        //crete new node
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        //new node next head
        newnode.next=head;
        //update head
        head=newnode;

    }
    public  void addLast(int data){
        Node newnode=  new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public  void printL(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
            return;
        }
        while (temp!= null) {
           System.out.print(temp.data+ " -> "); 
           temp=temp.next;
        }
        System.out.println("null");
    }
    public  void add(int idx , int data){
        Node newnode = new Node(data);
        int i=0;
        Node temp = head;

        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
    }
    //remove 
    public  int removeFirst(){
        size--;
        int val =head.data;
        head=head.next;
        return val;
    }
    public  int removeLast(){
        Node temp=head;
       for(int i=0; i<size-2;i++){
       temp= temp.next;
       }
       int val= temp.next.data;
       temp.next=null;
       tail=temp;
       size--;
       return  val;

    }
    //iterartive serch
    public int search(int key){
        Node temp = head;
        for(int i=0 ; i<size ;i++){
         if(head.data==key){
            return i;
         }
         head=head.next;
        }

        return -1;
    }
    //reverse list
    public void Reverse(){
    Node prev = null;
    Node current = head;
    Node next;

    tail = head;

    while(current != null){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }

    head = prev;
}

 public void removeNthend(int n){
    int sz=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
        head=head.next;//remove first

    }
    //size-n
      int i=1;
      int tofind=sz-n;
      Node prev= head;
      while (i<tofind) {
        prev=prev.next;
        i++;
      }
      prev.next=prev.next.next;
      return;
        
    }
 //list is palindrome
//find mid node
//step 1

public Node findMid(Node head){
    Node slow=head;
    Node fast=head;

    while (fast!=null && fast.next!=null) {
        slow = slow .next;
        fast=fast.next.next;
    }
    return slow;
}
public boolean checkPalindrome(){
    if(head==null || head.next==null){
        return true;
    }
    //step 1 - find mid
    Node miNode=findMid(head);
    //step2 - reverse 2nd half
    Node prev =null;
    Node current =miNode;
    Node next;

    while(current != null){
        next=current.next;
        current.next=prev;
        prev = current;
        current =next;
    }
    Node right=prev;
    Node left=head;

    //strep 3 check left half % right half

    while(right!= null){
    if(left.data!= right.data){
        return false;
    }
    left = left.next;
    right=right.next;
    }
    return true;
}

    public static  void main(String[] args) {
        LinkedList ll=new LinkedList();
        // ll.printL();
//            ll.addFirst(2);
//         // ll. printL();
//       ll.  addFirst(1);
       
//         ll.addLast(4);
        
//         ll.addLast(3);
       

//         ll. add(2, 05);
       
//         // ll.removeFirst();
//         //   ll.printL();
//         //   System.out.println(size);
//         //   ll.removeLast();
//          ll.printL();
//      System.out.println( ll.search(10));   
//      ll.Reverse();
//      ll.printL();


ll.addLast(1);
ll.addLast(2);
ll.addLast(2);
ll.addLast(2);
ll.addLast(1);

ll.printL();
//ll.Reverse();

//ll.removeNthend(3);
System.out.println(ll.checkPalindrome());
ll.printL();
 
// 
}



}