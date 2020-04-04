import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] zero = new int[41];
		int[] one = new int[41];

		zero[0] = 1;
		zero[1] = 0;
		one[0] = 0;
		one[1] = 1;

		for (int i = 2; i < zero.length; i++) {
			zero[i] = zero[i - 1] + zero[i - 2];
			one[i] = one[i - 1] + one[i - 2];
		}

		int cases = sc.nextInt();
		while (cases-- > 0) {
			int idx = sc.nextInt();
			System.out.println(zero[idx] + " " + one[idx]);
		}
	}
}
