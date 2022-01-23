import java.util.Scanner;

public class A_B3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int hundred = B/100;
		int ten = (B-hundred*100)/10;
		int one = B-hundred*100-ten*10;
		
		System.out.println(A*one);
		System.out.println(A*ten);
		System.out.println(A*hundred);
		System.out.println(A*B);
	}
}
