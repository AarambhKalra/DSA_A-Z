package Linked_List;

public class doubly {

	public static Node convert(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			temp.prev=mover;
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
		
		if(head==null || head.next==null) return null;
		
		Node temp = head;
		head = head.next;
		head.prev = null;
		temp.next=null;
		
		
		return head;
	}
	
	public static Node deleteTail(Node head) {
		
		if(head.next==null||head==null) return null;
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next.prev = null;
		temp.next = null;
		
		
		return head;
	}
	
	public static Node deletek(Node head,int k) {
		
		if(head==null) return null;
		
		if(k==1) {
			head=head.next;
			head.prev=null;
			return head;
		}
		int cnt = 0;
		Node temp = head;
		while(temp!=null) {
			cnt++;
			if(cnt==k) {
				break;
			}
			temp = temp.next;
		}
		    Node back = temp.prev;
			Node front = temp.next;
			
			if(back==null&&front==null) {
				return null;
			}else if(back == null) {
				head = temp.next;
				front.prev=null;
				temp.next = null;
				return head;
			}else if(front==null) {
				temp.prev = null;
				back.next = null;
				return head;
			}else {
				back.next = front;
				front.prev = back;
				temp.next = null;
				temp.prev = null;
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
				break;
			}
			temp = temp.next;
		}
		 Node back = temp.prev;
		 Node front = temp.next;
			
			if(back==null&&front==null) {
				return null;
			}else if(back == null) {
				head = temp.next;
				front.prev=null;
				temp.next = null;
				return head;
			}else if(front==null) {
				temp.prev = null;
				back.next = null;
				return head;
			}else {
				back.next = front;
				front.prev = back;
				temp.next = null;
				temp.prev = null;
			}
		
		return head;
	}
    
    public static Node inserAtBegin(Node head,int el) {
    	
    	Node temp = new Node(el);
    	temp.next = head;
    	head.prev = temp;
    	
    	return temp;
    }
    
    public static Node insertAtEnd(Node head,int el) {
    	
    	
    	
    	if(head == null) return new Node(el);
    	
    	Node temp = head;
    	
    	while(temp.next!=null) {
    		temp = temp.next;
    	}
    	
    	Node back = temp.prev;
    	
    	Node newNode = new Node(el);
    	back.next = newNode; 
    	newNode.prev = back;
    	newNode.next = temp;
    	temp.prev = newNode;
    	temp.next = null;  
    	
    	return head;
    }
    
    public static Node insertAtK(Node head,int p,int x) {
    	
    	Node newNode = new Node(x);
    	
    	if(head == null) {
    		if(p==1) return newNode;
    		else return null;
    	}
		
//		if(p==1) {
//			newNode.next = head;
//			return newNode;
//		}
		int cnt = 0;
		Node temp = head;
		while(temp!=null) {
			cnt++;
			if(cnt==p){
				break;
			}
			temp = temp.next;
		}
		
		Node back = temp.prev;
		Node front = temp.next;
		if(back==null&&front==null) {
			return newNode;
		}else if(back == null) {
			newNode.next = front;
			front.prev = newNode;
			temp.next = newNode;
			newNode.prev = temp;
			return temp;
		}else if(front==null) {
			temp.next = newNode;
			newNode.prev = temp;
			return head;
		}else {
			temp.next = newNode;
			newNode.prev = temp;
			front.prev = newNode;
			newNode.next = front;			
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
