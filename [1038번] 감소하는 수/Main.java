import java.util.ArrayList;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		initList();

		for (int i = 1; i < lists.length; i++) {
			for (int j = 1; j < 10; j++) {
				for (String str : lists[i - 1]) {
					if (str.charAt(0) - '0' >= j)
						break;
					lists[i].add(j + str);
				}
			}
			answer.addAll(lists[i]);
		}

		if (answer.size() > N)
			System.out.println(answer.get(N));
		else
			System.out.println(-1);
	}
}
