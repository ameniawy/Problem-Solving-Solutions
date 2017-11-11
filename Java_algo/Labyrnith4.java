import java.util.*;
import java.io.*;

public class Labyrnith4 {
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
							shortest(r, c);// r and c are the starting point..
											// this
											// is the first bfs
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

			shortest(indexr, indexc);
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

	public static void shortest(int row, int col) {// finding shortest path for
		// un-weighted graph
		for (int i = 0; i < distance.length; i++)
			Arrays.fill(distance[i], -1);
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> p = new LinkedList<Integer>();

		distance[row][col] = 0;

		int u = 0;
		int y = 0;
		q.add(row);
		p.add(col);
		while (!q.isEmpty()) {
			u = q.remove();
			y = p.remove();

			for (int i = 0; i < dx.length; i++) {
				int newr = u + dx[i];
				int newc = y + dy[i];

				if (newr >= 0 && newr < maxr && newc >= 0 && newc < maxc
						&& graph[newr][newc] != '#'
						&& distance[newr][newc] == -1) {

					distance[newr][newc] = distance[u][y] + 1;

					q.add(newr);
					p.add(newc);
				}
			}
		}
	}
}
