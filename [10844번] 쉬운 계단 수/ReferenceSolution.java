import java.util.*;

class Main {
	final static int mod = 1000000000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		int[][] numbers = new int[N][12];
		numbers[0] = new int[] { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0 };

		for (int i = 1; i < numbers.length; i++) {
			for (int j = 1; j < numbers[i].length - 1; j++) {
				numbers[i][j] = (numbers[i - 1][j - 1] + numbers[i - 1][j + 1]) % mod;
			}
		}

		long sum = 0;
		for (long n : numbers[N - 1]) {
			sum += n;
		}

		System.out.println(sum % mod);
	}
}
