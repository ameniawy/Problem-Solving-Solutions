import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class prob2 {
	static ArrayList<Integer>[] graph;
	static boolean[] visited;
	static int[] longest;
	static int src;
	static int distance[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int nodes = Integer.parseInt(st.nextToken());
		graph = new ArrayList[nodes];
		longest = new int[nodes];

		for (int i = 0; i < nodes; i++)
			graph[i] = new ArrayList<Integer>();

		visited = new boolean[nodes];

		for (int i = 1; i < nodes; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st2.nextToken()) - 1;
			int y = Integer.parseInt(st2.nextToken()) - 1;
			graph[x].add(y);
			graph[y].add(x);

		}
		distance = new int[nodes];
		shortest(0);

		int longg = distance[0];
		int index = 0;
		for (int i = 0; i < distance.length; i++) {
			if (distance[i] > longg) {
				longg = distance[i];
				index = i;
			}
		}
		shortest(index);
		longg = distance[0];

		for (int i = 0; i < distance.length; i++) {
			if (distance[i] > longg)
				longg = distance[i];
		}

		System.out.println(longg);
	}

	public static void shortest(int src) {// finding shortest path for
											// un-weighted graph
		Arrays.fill(distance, -1);
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(src);
		distance[src] = 0;
		int u = 0;
		while (!q.isEmpty()) {
			u = q.remove();

			for (int i = 0; i < graph[u].size(); i++) {
				int v = graph[u].get(i);
				if (distance[v] == -1) {
					distance[v] = distance[u] + 1;
					q.add(v);
				}
			}
		}
	}

}
