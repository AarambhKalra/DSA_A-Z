package Linked_List;

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class Arr_to_ll {
	
	public static Node convert(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		
		
		return head;
	}
	
	public static void print(Node head) {
        Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		
	}
	
	public static int length(Node head) {
        Node temp = head;
		int cnt = 0;
		while(temp != null) {
			cnt++;
			temp = temp.next;
		}
		return cnt;
		
	}
	
	public static boolean search(Node head,int k) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data==k) return true;
			temp = temp.next;
		}
		return false;
	}
	
	public static Node deleteHead(Node head) {
		
		if(head==null) return null;
		
		Node temp = head;
		head = head.next;
		temp.next=null;
		
		
		return head;
	}
	
	public static Node deleteTail(Node head) {
		
		if(head.next==null||head==null) return null;
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
		
		return head;
	}
	
	public static Node deletek(Node head,int k) {
		
		if(head==null) return null;
		
		if(k==1) {
			head=head.next;
			return head;
		}
		int cnt = 0;
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			cnt++;
			if(cnt==k-1) {
				temp.next=temp.next.next;
				//prev.next=prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
	
    public static Node deleteel(Node head,int el) {
		
		if(head==null) return null;
		
		if(head.data==el) {
			head=head.next;
			return head;
		}
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(temp.data==el) {
				prev.next=prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
    
    public static Node inserAtBegin(Node head,int el) {
    	
    	Node temp = new Node(el);
    	temp.next = head;
    	
    	return temp;
    }
    
    public static Node insertAtEnd(Node head,int el) {
    	
    	
    	
    	if(head == null) return new Node(el);
    	
    	Node temp = head;
    	
    	while(temp.next!=null) {
    		temp = temp.next;
    	}
    	
    	temp.next = new Node(el);
    	
    	return head;
    }
    
    public static Node insertAtK(Node head,int k,int el) {
    	
    	Node newNode = new Node(el);
    	
    	if(head == null) {
    		if(k==1) return newNode;
    		else return null;
    	}
		
		if(k==1) {
			newNode.next = head;
			return newNode;
		}
		int cnt = 0;
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			cnt++;
			if(cnt==k) {
				prev.next=newNode;
				newNode.next = temp;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
    	
    }
    
    public static Node insertbeforeel(Node head,int el,int add) {
    	
    	Node newNode = new Node(add);
    	
    	if(head == null) {
    		return null;
    	}
		
		if(head.data==el) {
			newNode.next = head;
			return newNode;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next!=null) {
			if(temp.data==el) {
				prev.next=newNode;
				newNode.next = temp;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
    	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {22,4,6,8,11,34,55,12};
	
		
		Node head = convert(arr);
		
		print(head);
		
		System.out.println();
		
		System.out.println(length(head));
		
		System.out.println(search(head , 6));
		
		head = deleteHead(head);
		
		print(head);
		
		System.out.println();
		
		head = deleteTail(head);
		
		print(head);
		
		System.out.println();
		
		head = deletek(head,3);
		
		print(head);
		
		System.out.println();
		
		head = deleteel(head,55);
		
		print(head);
		
		System.out.println();
		
		head = inserAtBegin(head,70);
		
		print(head);
		
		System.out.println();
		
		head = insertAtEnd(head,100);
		
		print(head);
		
		System.out.println();
		
		head = insertAtK(head,3,27);
		
		print(head);
		
		System.out.println();
		
		head = insertbeforeel(head,34,33);
		
		print(head);
		
		System.out.println(head);
	}

}
