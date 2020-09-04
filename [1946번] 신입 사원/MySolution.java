import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int T = sc.nextInt();

		while (T-- > 0) {
			int N = sc.nextInt(), cnt = 0;

			int[][] scores = new int[N][2];
			for (int i = 0; i < N; i++) {
				scores[i][0] = sc.nextInt();
				scores[i][1] = sc.nextInt();
			}

			Arrays.sort(scores, new Comparator<int[]>() {
				public int compare(int[] o1, int[] o2) {
					return ((Comparable) o1[0]).compareTo(o2[0]);
				}
			});

			int best = N;
			for (int[] score : scores) {
				if (score[1] <= best) {
					best = score[1];
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
