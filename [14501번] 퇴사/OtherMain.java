import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		int[] T = new int[N];
		int[] P = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();

			if (N < T[i] + i) {
				P[i] = 0;
			}
		}

		int[] dp = new int[N + 1];
		dp[N - 1] = P[N - 1];

		int max = 0;
		for (int i = N - 2; i >= 0; i--) {
			if (T[i] + i < N + 1) {
				dp[i] = Math.max(dp[T[i] + i] + P[i], dp[i + 1]);
			} else {
				dp[i] = dp[i + 1];
			}
			max = Math.max(dp[i], max);
		}
		System.out.println(max);
	}
}
