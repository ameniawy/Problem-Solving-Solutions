package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Party87A {
	static ArrayList<Integer>[] adjList;
	static int distance[];
	static Queue<Integer> q;

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		adjList = new ArrayList[n + 1];
		distance = new int[n + 1];
		q = new LinkedList<Integer>();
		for (int i = 0; i < n+1; ++i)
			adjList[i] = new ArrayList<Integer>();

		for (int j = 1; j < adjList.length; j++) {
			int v = Integer.parseInt(br.readLine());
			if (v == -1) {
				q.add(j);
				distance[j] = 1;
			} else
				adjList[v].add(j);
		}
		int res = bfs();
		System.out.println(res);

	}

	static int bfs() {
		int min = 1;
		while (!q.isEmpty()) {
			int u = q.remove();
			for (int i = 0; i < adjList[u].size(); i++) {
				int v = adjList[u].get(i);
				min = Math.max(min, distance[v] = distance[u] + 1);
				q.add(v);
			}
		}
		return min;
	}

}
