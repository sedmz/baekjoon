import java.util.*;

class Main {
	final static int mod = 1000000000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		long[][] numbers = new long[N][10];
		numbers[0] = new long[] { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] %= mod;

				if (j > 0) {
					numbers[i + 1][j - 1] += numbers[i][j];
				}
				if (j < 9) {
					numbers[i + 1][j + 1] += numbers[i][j];
				}
			}
		}

		long sum = 0;
		for (long n : numbers[N - 1]) {
			sum = (sum + n);
		}
		
		System.out.println(sum % mod);
	}
}
