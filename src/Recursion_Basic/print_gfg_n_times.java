package Recursion_Basic;

public class print_gfg_n_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printGfg(n);

	}
	static void printGfg(int N) {
        // code here
        if(N==0){
            return ;
        }
        printGfg(N-1);
        System.out.print("GFG ");
    }

}
