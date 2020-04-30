import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static HashMap<Integer, Integer> map = new HashMap<>();
	static int max = 0;

	public static void main(String[] args) {
		int N = sc.nextInt();

		ArrayList<int[]> time = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			time.add(new int[] { -1, -1 });
			time.get(i)[0] = sc.nextInt();
			time.get(i)[1] = sc.nextInt();
		}

		Collections.sort(time, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = ((int[]) o1)[0];
				Object v2 = ((int[]) o2)[0];

				if (v1 == v2) {
					return ((Comparable) ((int[]) o2)[1]).compareTo(((int[]) o1)[1]);
				}
				return ((Comparable) v1).compareTo(v2);
			}
		});

		for (int i = 0; i < time.size() - 1;) {
			int e1 = time.get(i)[1], e2 = time.get(i + 1)[1];
			
			if (e1 >= e2) {
				time.remove(i);
			} else {
				i++;
			}
		}
		
		N = time.size();
		for (int i = 0; i < N; i++) {
			if (N - i <= max)
				break;
			int cnt = 1;
			int endTime = time.get(i)[1];
			for (int j = i + 1; j < N; j++) {
				if (time.get(j)[0] < endTime)
					continue;
				cnt++;
				endTime = time.get(j)[1];
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
