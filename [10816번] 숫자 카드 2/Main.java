import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final int UNSIGNED = 10000000;
	static int card[] = new int[UNSIGNED * 2 + 1];

	public static void main(String[] args) throws IOException {
		br.readLine();

		String inputs[] = br.readLine().split(" ");
		for (String input : inputs)
			card[Integer.parseInt(input) + UNSIGNED]++;

		br.readLine();

		String nums[] = br.readLine().split(" ");
		for (String num : nums)
			System.out.print(card[Integer.parseInt(num) + UNSIGNED] + " ");
	}
}
