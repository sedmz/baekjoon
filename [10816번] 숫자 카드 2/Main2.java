import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		String inputs[] = br.readLine().split(" ");

		for (String input : inputs) {
			map.put(input, map.getOrDefault(input, 0) + 1);
		}

		int M = Integer.parseInt(br.readLine());
		String nums[] = br.readLine().split(" ");
		for (String num : nums) {
			System.out.print(map.getOrDefault(num, 0) + " ");
		}
	}
}
