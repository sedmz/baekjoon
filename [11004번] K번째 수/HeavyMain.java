import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);
	static PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

	public static void main(String[] args) {
		int tests = sc.nextInt();
		int K = sc.nextInt();

		for (int i = 0; i < K; i++)
			queue.add(Integer.MAX_VALUE);

		for (int i = 0; i < tests; i++)
			queue.add(Math.min(sc.nextInt(), queue.poll()));
		
		System.out.println(queue.peek());
	}
}
