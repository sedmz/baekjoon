import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		int[] T = new int[N];
		int[] P = new int[N];

		for (int i = 0; i < N; i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}

		int max = 0;
		for (int i = 0; i < N; i++) {
			int subMax = 0;
			for (int j = 0; j < i; j++) {
				if (T[j] + j <= i) {
					subMax = Math.max(subMax, P[j]);
				}
			}
			if (T[i] + i <= N) {
				P[i] += subMax;
				max = Math.max(P[i], max);
			}
		}
		System.out.println(max);
	}
}
