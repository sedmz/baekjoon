import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(), max = 0;

		int[] arr = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		int[] cases = new int[N];

		for (int i = 0; i < N; i++) {
			int subMax = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					subMax = Math.max(cases[j], subMax);
				}
			}
			cases[i] += subMax;
			max = Math.max(max, cases[i]);
		}
		
		System.out.println(max + 1);
	}
}
