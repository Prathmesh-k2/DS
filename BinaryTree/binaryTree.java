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
//level order 
public static void levelOrder(Node root){
	if(root==null) return;
	
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
        	
            
        }
    

}
