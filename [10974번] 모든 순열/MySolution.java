import java.util.Scanner;
import java.util.Stack;

class Main {
	static Scanner sc = new Scanner(System.in);
	static Stack<String> strings = new Stack<>();

	public static void main(String[] args) {
		int n = sc.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++)
			nums[i] = n - i;

		strings.add("");
		while (!strings.isEmpty()) {
			String string = strings.pop();

			if (string.length() == n * 2) {
				System.out.println(string.trim());
				continue;
			}

			for (int num : nums)
				if (!string.contains(num + "")) {
					strings.add(string + " " + num);
				}
		}
	}
}
