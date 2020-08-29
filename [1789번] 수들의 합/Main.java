import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long S = sc.nextInt();

		long N = 0, i = 0;
		while (N <= S) {
			N += ++i;
		}
		System.out.println(i - 1);
	}
}
