import java.io.*;
import java.util.*;

public class PT07FAShortVacationSPOJ {
	static ArrayList<Integer> graph[];
	static boolean vis[];
	static int tickets;
	static String route;

	static ArrayList<String> output;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		br.readLine();
		for (int z = 0; z < tests; z++) {
			int nodes = Integer.parseInt(br.readLine());
			graph = new ArrayList[nodes + 1];

			for (int i = 0; i < nodes + 1; i++)
				graph[i] = new ArrayList<Integer>();

			vis = new boolean[nodes + 1];

			for (int i = 0; i < nodes - 1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				graph[from].add(to);
				graph[to].add(from);
				
			}

			tickets = 1;
			output = new ArrayList<String>();
			for (int p = 1; p < nodes + 1; p++) {
				route="";

				if (!vis[p]) {
					System.out.println(1);
					dfs(p);
					output.add(route);
					

				}

			}

			System.out.println(tickets);
			for (int l = 0; l < output.size(); l++) {
				System.out.println(output.get(l));

			}

		}

	}

	public static void dfs(int node) {
		vis[node] = true;
		
		
		route = route + node + " ";
		for (int i = 0; i < graph[node].size(); i++) {
			int destination = graph[node].get(i);
			if (!vis[destination])
				dfs(destination);
		}
		

	}

}
