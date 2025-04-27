package Stack;

public class using_array {
	
	static int top = -1;
	static int[] arr = new int[10];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		push(2);
		top();
		size();
		push(3);
		top();
		size();
		push(4);
		top();
		size();
		pop();
		top();
		size();
		pop();
		top();
		size();
		pop();
		top();
		size();
		pop();


	}
	
	static void push(int x) {
		if(top==arr.length) {
			System.out.println("Stack Overflow");
			return ;
		}
		top++;
		arr[top] = x;
	}
	
	static void top() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		if(top==arr.length) {
			System.out.println("Stack Overflow");
			return ;
		}	
		System.out.println("Top Element is "+ arr[top]);
	}
	
	static void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		arr[top]=0;		
		top--;
		System.out.println("POPED");
	}
	
	static void size() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return;
		}
		if(top==arr.length) {
			System.out.println("Stack Overflow");
			return ;
		}
		
		int ans = top +1;
		
		System.out.println("Size " + ans);
		
	}

}
