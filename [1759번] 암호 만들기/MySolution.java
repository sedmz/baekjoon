import java.util.*;

class Main {
	final static int mod = 1000000000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int L = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();

		String[] alpha = sc.nextLine().split(" ");
		Arrays.sort(alpha);

		Set<String> vowels = new HashSet<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("o");
		vowels.add("u");
		vowels.add("i");

		Queue<String> ciphers = new LinkedList<>();
		Queue<Integer> indexs = new LinkedList<>();
		Queue<Integer> vowelCounts = new LinkedList<>();
		ciphers.add("");
		indexs.add(-1);
		vowelCounts.add(0);

		while (!ciphers.isEmpty()) {
			String cipher = ciphers.poll();
			int index = indexs.poll();
			int count = vowelCounts.poll();

			if (cipher.length() == L) {
				if (count >= 1 && count <= L - 2) {
					System.out.println(cipher);
				}
				continue;
			}

			for (int i = index + 1; i < C; i++) {
				ciphers.add(cipher + alpha[i]);
				indexs.add(i);
				if (vowels.contains(alpha[i])) {
					vowelCounts.add(count + 1);
				} else {
					vowelCounts.add(count);
				}
			}
		}
	}
}
