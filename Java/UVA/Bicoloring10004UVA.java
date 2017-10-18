package UVA;
import java.util.*;
import java.io.*;

public class Bicoloring10004UVA {
	static ArrayList<Integer>[] graph;
	static int colour[];
	static boolean visited[];
	static boolean isBipartite;

	public static boolean bfs() {// traversing the graph using bfs
		Queue<Integer> q = new LinkedList<Integer>();
		Arrays.fill(colour, -1);
		q.add(0);
		colour[0] = 0;
		isBipartite = true;
		visited[0] = true;

		while (!q.isEmpty() && isBipartite) {
			int u = q.remove();
			for (int i = 0; i < graph[u].size(); i++) {
				int v = graph[u].get(i);
				if (!visited[v]) {
					colour[v] = 1 - colour[u];
					visited[v] = true;
					q.add(v);
				} else if (colour[v] == colour[u]) {
					isBipartite = false;
					return false;
				}

			}
		}
		return isBipartite;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int nodes = Integer.parseInt(br.readLine());
			if (nodes == 0)
				break;
			int edges = Integer.parseInt(br.readLine());
			graph = new ArrayList[nodes];
			for (int i = 0; i < nodes; i++)
				graph[i] = new ArrayList<Integer>();
			visited = new boolean[nodes];
			colour = new int[nodes];

			for (int i = 0; i < edges; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				graph[from].add(to);
				graph[to].add(from);
			}
			// for(int i=0;i<graph.length;i++)
			// System.out.println(graph[i].toString());
			
			if (bfs()) {
				System.out.println("BICOLORABLE.");
			} else {
				System.out.println("NOT BICOLORABLE.");
			}

		}

	}

}
