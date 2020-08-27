import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	static int[][] cabbage;
	static int T, M, N;

	static class Scan {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		public int nextInt() throws Exception {
			if (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());

			return Integer.parseInt(st.nextToken());
		}
	}

	public static void main(String[] args) throws Exception {
		Scan sc = new Scan();
		T = sc.nextInt();

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
