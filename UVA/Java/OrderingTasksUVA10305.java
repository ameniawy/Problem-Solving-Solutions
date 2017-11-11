package UVA;
import java.util.*;
import java.io.*;

public class OrderingTasksUVA10305 {
	static Stack<Integer> topo;
	static boolean visited[];
	static ArrayList<Integer> graph[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tasks = Integer.parseInt(st.nextToken());
			int edges = Integer.parseInt(st.nextToken());
			if(tasks==0&&edges==0)
				break;
			graph = new ArrayList[tasks + 1];
			for (int i = 1; i <= tasks; i++)
				graph[i] = new ArrayList<Integer>();

			for (int i = 1; i <= edges; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				graph[Integer.parseInt(st2.nextToken())].add(Integer
						.parseInt(st2.nextToken()));
			}
//			System.out.println(graph[5].get(0));
			topo = new Stack<Integer>();
			visited = new boolean[tasks + 1];
			for (int i = 1; i <= tasks; i++) {
				if (!visited[i])
					topological(i);
			}
			for (int i = 0; i < tasks; i++) {
				System.out.print(topo.pop());
				if (!topo.isEmpty())
					System.out.print(" ");
			}
			System.out.println();
		}

	}

	public static void topological(int u) {
		if (visited[u])
			return;
		visited[u] = true;

		for (int i = 0; i < graph[u].size(); i++)
			topological(graph[u].get(i));

		topo.push(u);

	}

}
