import java.util.Scanner;

public class fibo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x;
		
		x = sc.nextInt();
		
		System.out.println(fibo(x));
		
	}
	
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}else
			return fibo(n-2) + fibo(n-1);
	}

}
