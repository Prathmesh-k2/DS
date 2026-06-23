import java.util.*;
public class binaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
        data=d;
//        left=null;
//        right=null;
        }
    }
//    static class  binaryTreeA{
//      //  static int index=-1;
public static void display(Node root){
	if (root==null) return;
		
	
	System.out.print(root.data +"-> ");
	if(root.left!=null) System.out.print(root.left.data +" ");
	if(root.right!=null )System.out.println(root.right.data +" ");
	System.out.println();
	display(root.left);
	display(root.right);
}
//preordr = root-> root left subtree then rigth
public static void preOrder(Node root){
	if(root==null){
		return ;
	}
	System.out.print(root.data+" ");
	preOrder(root.left);
	preOrder(root.right);
}
//inoredr left subtree   lright then rigth
public static void inOredr(Node root){
	if(root == null){
		return;
	}
	inOredr(root.left);
	System.out.print(root.data + " ");
	inOredr(root.right);
}
//postOrder left rigth root
public static void postOrder(Node root){
if(root==null) return;
postOrder(root.left);
postOrder(root.right);
System.out.print(root.data +" ");
}
//level ordere
public static void bfs(Node root){
	Queue<Node>q=new LinkedList<>();
	if(root!=null) q.add(root);
	while(q.size()>0){
		Node temp=q.peek();
		if(temp.left!=null) q.add(temp.left);
		if(temp.right!=null) q.add(temp.right);
		System.out.print(temp.data+" ");
		q.remove();

	}
}
public static int size( Node root){
	if(root==null) return 0;
	return 1+size(root.left)+size(root.right);
}
	public static int sum(Node root){
		if(root==null) return 0;
        return  root.data+sum(root.left)+sum(root.right);
	}

public static int max(Node root){
if(root==null) return 0;
int a=root.data;
int b=max(root.left);
int c=max(root.right);
 return Math.max(a,Math.max(b,c));
}
	


     public static void main(String [] args) {
        	Node root =new Node(2);
        	Node a =new Node(4);
        	Node b =new Node(10);
        	root.left=a;
        	root.right=b;
        	
        	Node c =new Node(6);
        	Node d =new Node(5);
        	a.left=c;
        	a.right=d;
        	
        	
        	Node e =new Node(11);
        	b.right=e;
			//display(root);
			preOrder(root);
			System.out.println();

			inOredr(root);
				System.out.println();
			postOrder(root);
			System.out.println();
        	System.out.println(size(root));
			System.out.println(sum(root));
			System.out.println(max(root));
			//System.out.println(bfs(root));
			bfs(root);
            
        }
    

}
