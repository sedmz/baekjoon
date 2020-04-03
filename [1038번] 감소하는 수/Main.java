import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static ArrayList<String> lists[];
	static ArrayList<String> answer;

	public static void initList() {
		lists = new ArrayList[10];
		for (int i = 0; i < lists.length; i++)
			lists[i] = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			lists[0].add(i + "");
		}
		answer = new ArrayList<>();
		answer.addAll(lists[0]);
	}

	public static void sort() {
		Collections.sort(answer, new Comparator() {
			public int compare(Object o1, Object o2) {
				long n1 = Long.parseLong((String) o1);
				long n2 = Long.parseLong((String) o2);
				return Long.compare(n1, n2);
			}
		});
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		initList();

		for (int i = 1; i < lists.length; i++) {
			for (String str : lists[i - 1]) {
				int n = str.charAt(0) - '0';
				for (int j = 9; j > n; j--) {
					lists[i].add(j + str);
				}
			}
			answer.addAll(lists[i]);
		}

		sort();

		if (answer.size() > N)
			System.out.println(answer.get(N));
		else
			System.out.println(-1);
	}
}
