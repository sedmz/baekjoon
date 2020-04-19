import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		Stack<String> stack = new Stack<>();
		String s;

		while (test-- > 0) {
			String op[] = br.readLine().split(" ");

			switch (op[0]) {
			case "push":
				stack.add(op[1]);
				break;
			case "pop":
				s = stack.isEmpty() ? "-1" : stack.pop();
				System.out.println(s);
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				s = stack.isEmpty() ? "1" : "0";
				System.out.println(s);
				break;
			case "top":
				s = stack.isEmpty() ? "-1" : stack.peek();
				System.out.println(s);
				break;
			}
		}
	}
}
