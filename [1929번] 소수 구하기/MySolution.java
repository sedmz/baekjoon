import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int M = sc.nextInt();
		int N = sc.nextInt();

		for (int n = M; n <= N; n++) {
			if (isPrimeNumber(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isPrimeNumber(int n) {
		int cnt = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				cnt++;
		}
		return cnt == 0 && n != 1;
	}
}
