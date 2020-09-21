import java.util.Scanner;

public class Main {
	static StringBuilder result;
	static boolean[] visits;
	static char[] num;
	static int N;

	public static void init() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		result = new StringBuilder();
		num = new char[N];
		visits = new boolean[N];
	}

	public static void main(String[] args) {
		init();
		permutation(0);
		System.out.println(result);
	}

	private static void permutation(int depth) {
		if (depth == N) {
			for (int i = 0; i < N; i++) {
				result.append(num[i]).append(' ');
			}
			result.append('\n');
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visits[i]) {
				visits[i] = true;
				num[depth] = (char) ('0' + (i + 1));
				permutation(depth + 1);
				visits[i] = false;
			}
		}
	}
}
