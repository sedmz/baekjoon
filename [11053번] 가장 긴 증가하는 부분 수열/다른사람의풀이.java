import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), max = 0;

		int num[] = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int dp[] = new int[N];
		for (int i = 1; i < N; i++) {
			int subMax = -1;
			for (int j = 0; j < i; j++) {
				if (num[i] > num[j])
					subMax = Math.max(subMax, dp[j]);
			}
			dp[i] = subMax + 1;
			max = Math.max(dp[i], max);
		}

		System.out.println(max + 1);
	}
}
