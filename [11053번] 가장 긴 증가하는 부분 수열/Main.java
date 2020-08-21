import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int num[];
	static int dist[][];

	public static void init() {
		N = sc.nextInt();

		num = new int[N];
		for (int i = 0; i < N; i++)
			num[i] = sc.nextInt();

		dist = new int[N][N];
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (num[i] < num[j])
					dist[i][j]++;
			}
		}
	}

	public static void search() {
		for (int V = 0; V < N; V++) {
			for (int S = 0; S < N - 1; S++) {
				for (int D = S + 1; D < N; D++) {
					if (V > S && V < D) {
						if (num[S] < num[V] && num[V] < num[D]) {
							dist[S][D] = Math.max(dist[S][D], dist[S][V] + dist[V][D]);
						}
					}
				}
			}
			getMaxValue();
		}
	}

	public static int getMaxValue() {
		int answer = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = 0; j < N; j++) {
				answer = Math.max(answer, dist[i][j]);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		init();
		search();
		System.out.println(getMaxValue() + 1);
	}
}
