import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String word[] = new String[n];
		for (int i = 0; i < n; i++)
			word[i] = sc.next();

		char[] op = new char[word[0].length()];
		Arrays.fill(op, '?');

		for (int i = 0; i < op.length; i++) {
			for (int j = 1; j <= word.length; j++) {
				if (j == word.length)
					op[i] = word[0].charAt(i);
				else if (word[j].charAt(i) != word[j - 1].charAt(i))
					break;
			}
		}
		System.out.println(String.copyValueOf(op));
	}
}
