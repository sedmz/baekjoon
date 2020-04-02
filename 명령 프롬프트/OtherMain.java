import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char[] word1 = sc.next().toCharArray();

		for (int i = 1; i < n; i++) {
			char[] word2 = sc.next().toCharArray();
			for (int j = 0; j < word1.length; j++) {
				if (word1[j] != word2[j])
					word1[j] = '?';
			}
		}
		System.out.println(word1);
	}
}
