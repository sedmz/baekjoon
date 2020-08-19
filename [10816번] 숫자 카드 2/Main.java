import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static final int MAX_VALUE = 10000000;

	public static void main(String[] args) throws IOException {
		br.readLine();
		String input[] = br.readLine().split(" ");
		int numbers[] = new int[MAX_VALUE * 2 + 1];

		for (int i = 0; i < input.length; i++)
			numbers[Integer.parseInt(input[i]) + MAX_VALUE]++;

		br.readLine();
		String output[] = br.readLine().split(" ");
		for (int i = 0; i < output.length; i++) {
			System.out.print(numbers[Integer.parseInt(output[i]) + MAX_VALUE]);
			if (i < output.length - 1)
				System.out.print(" ");
		}
	}
}
