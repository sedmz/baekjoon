import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<int[]> timeList = new ArrayList<>();
	static int max = 0, N;

	public static void initTimeList() {
		N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			timeList.add(new int[] { 0, 0, 1 });
			timeList.get(i)[0] = sc.nextInt();
			timeList.get(i)[1] = sc.nextInt();
		}
	}

	public static void sort() {
		Collections.sort(timeList, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = ((int[]) o1)[1];
				Object v2 = ((int[]) o2)[1];

				return ((Comparable) v1).compareTo(v2);
			}
		});
	}

	public static void main(String[] args) {
		initTimeList();
		sort();

		N = timeList.size();
		for (int i = N - 1; i >= 0; i--) {
			int end = timeList.get(i)[1];
			for (int j = i + 1; j < N; j++) {
				int start = timeList.get(j)[0];
				if (end <= start) {
					timeList.get(i)[2] += timeList.get(j)[2];
					max = Math.max(max, timeList.get(i)[2]);
					break;
				}
			}
		}
		System.out.println(max);
	}
}
