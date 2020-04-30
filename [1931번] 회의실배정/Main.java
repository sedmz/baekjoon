import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] timeList;

	public static void initTimeList() {
		int N = sc.nextInt();
		timeList = new int[N][2];
		for (int i = 0; i < N; i++) {
			timeList[i][0] = sc.nextInt();
			timeList[i][1] = sc.nextInt();
		}
	}

	public static void sortTimeList() {
		Arrays.sort(timeList, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return ((Comparable) o1[0]).compareTo(o2[0]);
				return ((Comparable) o1[1]).compareTo(o2[1]);
			}
		});
	}

	public static void main(String[] args) {
		initTimeList();
		sortTimeList();

		int cnt = 0, beforeEnd = 0;
		for (int[] time : timeList) {
			if (beforeEnd <= time[0]) {
				beforeEnd = time[1];
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
