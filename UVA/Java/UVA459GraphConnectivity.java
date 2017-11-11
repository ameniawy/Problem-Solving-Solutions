package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UVA459GraphConnectivity {
	static ArrayList<Integer>[] adjList;
	static boolean[] visited;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		br.readLine();
		for (int q = 0; q < tests; q++) {
			
			String line = br.readLine();
			int size = line.charAt(0) - 'A' +1;
			adjList = new ArrayList[size];
			visited = new boolean [size];
			for (int i = 0; i < adjList.length; i++) {
				adjList[i] = new ArrayList<Integer>();
			}
			
			String input;
			while (br.ready() && !(input = br.readLine()).equals("")) {
				int from = input.charAt(0) - 'A';
				int to = input.charAt(1) - 'A';
				adjList[from].add(to);
				adjList[to].add(from);
				
			}
			int counter =0;
			for(int i =0;i<visited.length;i++){
				if(!visited[i]){
					counter++;
					dfs(i);
				}
			}
			System.out.println(counter);
			if(q+1!=tests)
				System.out.println();

		}
	}

	static void dfs(int u) 
	{
		visited[u] = true;
		for (int v : adjList[u])
			if (!visited[v])
				dfs(v);

	}

}
