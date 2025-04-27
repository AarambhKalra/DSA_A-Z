package Binary_Tree;


class Node{
	int data;
	Node right;
	Node left;
	
	Node(int data, Node right, Node left){
		
		this.data  = data;
		this.right = right;
		this.left = left;
	}
	Node(int data){
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

public class intro {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node t = new Node(5);
		
		System.out.println(t.data);
		System.out.println(t.right);
		System.out.println(t.left);

		


	}

	

}
