import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStreamReader;

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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

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
			if (answer.size() > N)
				break;
		}

		if (answer.size() > N)
			System.out.println(answer.get(N));
		else
			System.out.println(-1);
	}
}
