import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt(), cnt = 0;

			int[] scores = new int[N];
			for (int i = 0; i < N; i++) {
				scores[sc.nextInt() - 1] = sc.nextInt();
			}

			int best = N;
			for (int score : scores) {
				if (score <= best) {
					best = score;
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
