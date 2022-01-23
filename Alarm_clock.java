import java.util.Scanner;

public class Alarm_clock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int M = sc.nextInt();

		String output = "";

		if (M >= 45) {
			// output = H + " " + (M - 45);
			M -= 45;
		} else {
			// output = (H-1) + " " + (M+15);
			H -= 1;
			if(H<0) {
				H=23;
			}
			M += 15;		
		}

		// System.out.println(output);
		System.out.println(H + " " + M);

	}

}
