import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int V = sc.nextInt(), E = sc.nextInt();
		int start = sc.nextInt();

		ArrayList<int[]>[] edges = new ArrayList[V + 1];
		for (int i = 1; i < edges.length; i++)
			edges[i] = new ArrayList<int[]>();

		for (int i = 0; i < E; i++) {
			int[] edge = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			edges[edge[0]].add(edge);
		}

		Set<Integer> visited = new HashSet<>();
		visited.add(start);

		PriorityQueue<int[]> remainEdges = new PriorityQueue<int[]>(new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[2], o2[2]);
			}
		});
		remainEdges.addAll(edges[start]);

		int[] shortest = new int[V + 1];

		while (!remainEdges.isEmpty()) {
			int[] edge = remainEdges.poll();

			if (!visited.contains(edge[1])) {
				visited.add(edge[1]);
				shortest[edge[1]] = edge[2];
				
				for (int[] e : edges[edge[1]]) {
					remainEdges.add(new int[] { e[0], e[1], shortest[e[0]] + e[2] });
				}
			}
		}

		for (int i = 1; i < shortest.length; i++) {
			if (i != start && shortest[i] == 0) {
				System.out.println("INF");
			} else {
				System.out.println(shortest[i]);
			}
		}
	}
}
