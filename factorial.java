import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
		
		//함수종료
		if(n==1) {
			return 1;
		}
		//5*4=20
		//20*3=60
		//60*2=120
		//120*1=120
		else {
			return n*factorial(n-1);
		}
	}

}
