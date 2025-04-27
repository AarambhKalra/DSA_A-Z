package Stack;
import java.util.Stack;
public class next_greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = {1,3,4,2};
		
		arr = nge(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}

	}
	
	public static Integer[] nge(Integer[] arr) {
		
		Integer[] ans = new Integer[arr.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--) {
			while(!st.isEmpty()&&st.peek()<=arr[i]) {
				st.pop();
			}
			if(st.isEmpty()) ans[i]=-1;
			else ans[i]=st.peek();
			st.push(arr[i]);	
		}	
		return ans;
	}

}
