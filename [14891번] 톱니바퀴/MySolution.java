import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	static String[] wheels = new String[4];
	static int[] center = { 0, 0, 0, 0 };

	public static void main(String[] args) {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = sc.next();
		}

		int T = sc.nextInt();
		while (T-- > 0) {
			rotate(sc.nextInt() - 1, sc.nextInt(), new int[] { -1, 1 });
		}

		System.out.println(calculate());
	}

	public static int calculate() {
		int point = 0;
		for (int i = 0; i < wheels.length; i++) {
			if (wheels[i].charAt(center[i]) == '1') {
				point += Math.pow(2, i);
			}
		}
		return point;
	}

	public static boolean compare(int i, int j) {
		int min = Math.min(i, j), max = Math.max(i, j);

		if (max >= 0 && max < center.length && min >= 0 && min < center.length) {
			if (wheels[min].charAt((center[min] + 2) % 8) != wheels[max].charAt((center[max] + 6) % 8)) {
				return true;
			}
		}
		return false;
	}

	public static void rotate(int i, int dir, int[] next) {
		boolean goNext[] = new boolean[next.length];
		for (int j = 0; j < next.length; j++) {
			goNext[j] = compare(i, i + next[j]);
		}

		center[i] += dir * -1;
		center[i] %= 8;
		if (center[i] < 0)
			center[i] += 8;

		for (int j = 0; j < next.length; j++) {
			if (goNext[j]) {
				rotate(i + next[j], dir * -1, new int[] { next[j] });
			}
		}
	}
}
