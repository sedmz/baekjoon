import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int menu[] = new int[5];
		for (int i = 0; i < 5; i++)
			menu[i] = Integer.parseInt(br.readLine());

		int burger = Math.min(Math.min(menu[0], menu[1]), menu[2]);
		int drink = Math.min(menu[3], menu[4]);

		System.out.println(burger + drink - 50);
	}
}
