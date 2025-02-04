package Codes;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countDigit(33454577));

	}
	static int countDigit(int n) {
       
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
