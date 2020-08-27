import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] cabbage;
	static int M, N;

	public static void main(String[] args) {
		int T = sc.nextInt();

		while (T-- > 0) {
			M = sc.nextInt();
			N = sc.nextInt();
			
			cabbage = new int[M][N];

			int K = sc.nextInt();
			while (K-- > 0) {
				cabbage[sc.nextInt()][sc.nextInt()] = 1;
			}

			int cnt = 0;
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (cabbage[i][j] > 0) {
						search(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	public static void search(int i, int j) {
		cabbage[i][j]--;

		if (i + 1 < M) {
			if (cabbage[i + 1][j] > 0) {
				search(i + 1, j);
			}
		}
		if (i > 0) {
			if (cabbage[i - 1][j] > 0) {
				search(i - 1, j);
			}
		}
		if (j + 1 < N) {
			if (cabbage[i][j + 1] > 0) {
				search(i, j + 1);
			}
		}
		if (j > 0) {
			if (cabbage[i][j - 1] > 0) {
				search(i, j - 1);
			}
		}
	}
}
