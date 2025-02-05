package Recursion_Basic;

public class Print_1_To_N_Without_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNos(10);

	}
	
	public static void printNos(int n) {
        // Your code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.print(n+" ");
    }

}
