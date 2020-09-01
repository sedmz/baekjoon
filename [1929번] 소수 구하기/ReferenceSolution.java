import java.util.Arrays;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] isPrimeNumber = new boolean[N + 1];
		Arrays.fill(isPrimeNumber, true);

		for (int n = 2; n <= N; n++) {
			if (!isPrimeNumber[n])
				continue;

			for (int i = n; i <= N; i += n) {
				isPrimeNumber[i] = false;
			}

			if (n >= M)
				System.out.println(n);
		}
	}
}
