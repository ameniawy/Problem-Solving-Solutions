import java.util.*;
import java.io.*;

public class Labyrnith3 {
	static char[][] graph;
	static boolean[][] visited;
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static int maxr;
	static int maxc;
	static int distance[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int times = Integer.parseInt(br.readLine());

		for (int i = 0; i < times; i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int col = Integer.parseInt(st.nextToken());
			int row = Integer.parseInt(st.nextToken());
			maxr = row;
			maxc = col;
			graph = new char[row][col];
			visited = new boolean[row][col];
			distance = new int[row][col];

			for (int j = 0; j < row; j++) {

				String line = br.readLine();
				graph[j] = line.toCharArray();

			}
			loop: {
				for (int r = 0; r < row; r++) {
					for (int c = 0; c < col; c++) {
						if (graph[r][c] != '#') {
							dfs(r, c);// r and c are the starting point.. this
										// is the first dfs
							break loop;
						}

					}

				}
			}
			int longg = 0;
			int indexr = 0;
			int indexc = 0;

			for (int q = 0; q < row; q++) {
				for (int j = 0; j < col; j++) {
					if (distance[q][j] > longg) { // finding max and its index
						longg = distance[q][j];
						indexr = q;
						indexc = j;
					}
				}
			}

			for (int z = 0; z < row; z++) { // resetting the arrays for second
											// dfs
				Arrays.fill(distance[z], 0);
				Arrays.fill(visited[z], false);
			}

			dfs(indexr, indexc); // second dfs
			longg = 0;
			for (int q = 0; q < row; q++) {
				for (int j = 0; j < col; j++) {
					if (distance[q][j] > longg) { // now finding absolute max
						longg = distance[q][j];

					}
				}
			}
			

			System.out.println("Maximum rope length is " + longg + '.');

		}

	}

	public static void dfs(int r, int c) {// dfs for maze
		visited[r][c] = true;

		for (int i = 0; i < dx.length; i++) {
			int newr = r + dx[i];
			int newc = c + dy[i];

			if (newr >= 0 && newr < maxr && newc >= 0 && newc < maxc
					&& !visited[newr][newc] && graph[newr][newc] != '#') {
				distance[newr][newc] = distance[r][c] + 1;
				dfs(newr, newc);
			}

		}// assume wall is '#'

	}

}
