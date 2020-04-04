import java.util.Scanner;

public class Main {
	static char[][] chess;
	static final int SIZE = 8;

	public static int check(int I, int J) {
		int cnt = 0;
		for (int i = I; i < I + SIZE; i++) {
			for (int j = J; j < J + SIZE; j++) {
				if ((i + j) % 2 == 0) {
					if (chess[i][j] == 'W')
						cnt++;
				} else {
					if (chess[i][j] == 'B')
						cnt++;
				}
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		chess = new char[N][M];
		for (int i = 0; i < N; i++) {
			chess[i] = sc.next().toCharArray();
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i + SIZE <= N; i++) {
			for (int j = 0; j + SIZE <= M; j++) {
				min = Math.min(min, check(i, j));
				min = Math.min(min, SIZE * SIZE - check(i, j));
			}
		}
		System.out.println(min);
	}
}
