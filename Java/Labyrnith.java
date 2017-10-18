import java.util.*;
import java.io.*;

public class Labyrnith {// in the first line we will take the number of nodes
						// and edges
	static char[][] graph;
	static boolean[][] visited;
	static char[][] maze;
	static int dx[] = { 1, 0, -1, 0 };
	static int dy[] = { 0, 1, 0, -1 };
	static int maxr;
	static int maxc;

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

			for (int j = 0; j < row; j++) {

				String line = br.readLine();
				for (int q = 0; q < col; q++) {
					graph[j][q] = line.charAt(q);
				}

			}
			int max = 0;
			for (int r = 0; r < row; r++) {
				for (int c = 0; c < col; c++) {
					if (graph[r][c] != '#') {
						
						max = Math.max(max, dfs(r, c)); // r and c are the
														// starting points

					}

				}

			}

			System.out.println("Maximum rope length is " + (max) + '.');

		}
		

	}

	public static int dfs(int r, int c) {// dfs for maze
		visited[r][c] = true;

		int max = 0;

		for (int i = 0; i < dx.length; i++) {
			int newr = r + dx[i];
			int newc = c + dy[i];

			if (newr >= 0 && newr < maxr && newc >= 0 && newc < maxc
					&& !visited[newr][newc] && graph[newr][newc] != '#') {

				max =Math.max(dfs(newr, newc), max);
			}

		}// assume wall is '#'

		return  1+max;
	}

}
