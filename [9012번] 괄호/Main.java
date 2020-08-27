import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static boolean isVPS(String brackets) {
		int cnt = 0;
		for (char bracket : brackets.toCharArray()) {
			if (bracket == '(')
				cnt++;
			else if (--cnt < 0)
				return false;
		}
		return cnt == 0;
	}

	public static void main(String[] args) {
		int testcase = sc.nextInt();

		while (testcase-- > 0) {
			if (isVPS(sc.next()))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
