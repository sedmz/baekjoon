import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();

		int[][] cards = new int[N][2];
		for (int i = 0; i < N; i++) {
			cards[i][0] = i + 1;
			cards[i][1] = sc.nextInt();
		}

		Arrays.sort(cards, new Comparator<>() {
			public int compare(int[] o1, int[] o2) {
				double pricePerCard1 = o1[1] / (double) o1[0];
				double pricePerCard2 = o2[1] / (double) o2[0];

				return ((Comparable) pricePerCard2).compareTo(pricePerCard1);
			}
		});

		int remaining = N, price = 0;
		for (int[] card : cards) {
			price += (remaining / card[0]) * card[1];
			remaining %= card[0];
		}
		System.out.println(price);
	}
}
