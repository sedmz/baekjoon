import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] times;

	public static void init() {
		int N = sc.nextInt();
		times = new int[N][2];
		for (int i = 0; i < N; i++) {
			times[i][0] = sc.nextInt();
			times[i][1] = sc.nextInt();
		}
	}

	public static void sort() {
		Arrays.sort(times, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return ((Comparable) o1[0]).compareTo(o2[0]);
				return ((Comparable) o1[1]).compareTo(o2[1]);
			}
		});
	}

	public static void main(String[] args) {
		init();
		sort();

		for (int i = 0; i < times.length; i++)
			System.out.println(Arrays.toString(times[i]));
		
		int cnt = 0, beforeEnd = 0;
		for (int[] time : times) {
			if (beforeEnd <= time[0]) {
				beforeEnd = time[1];
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
