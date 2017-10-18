package UVA;
import java.util.*;
import java.io.*;

public class CountingBlobsUVA871 {
	static int graph[][];
	static int maxr;
	static int maxc;
	static int dx[] = { 1, 0, -1, 0, -1, 1, -1, 1 };
	static int dy[] = { 0, 1, 0, -1, 1, 1, -1, -1 };
	static boolean[][] visited;
	static ArrayList<Integer> blobs;
	static int counter;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		br.readLine();
		for (int z = 0; z < tests; z++) {
			counter = -1;
			graph = new int[25][25];
			int r = 0;
			while (true) {
				String line = br.readLine();
				if (line == null || line.equals("")) {
					maxr = r;
					break;
				}
				for (int q = 0; q < line.length(); q++) {
					graph[r][q] = line.charAt(q) - '0';
					maxc = line.length() ;
				}
				r++;

			}
		

		visited = new boolean[maxr][maxc];
		blobs = new ArrayList<Integer>();
		for (int i = 0; i < maxr; i++) {
			for (int j = 0; j < maxc; j++) {
				if (!visited[i][j] && graph[i][j] == 1) {
					counter++;
					blobs.add(0);
					dfs(i, j);
				}
			}
		}
		int max = -1;

		for (int l = 0; l < blobs.size(); l++) {
			if (max < blobs.get(l))
				max = blobs.get(l);
		}
		if(z+1<tests){
			System.out.println(max + 1);
			System.out.println();
		}
		else
			System.out.println(max+1);

		
		}
	}

	public static void dfs(int r, int c) {// dfs for blobs
		visited[r][c] = true;
		for (int i = 0; i < dx.length; i++) {
			int newr = r + dx[i];
			int newc = c + dy[i];

			if (newr >= 0 && newr < maxr && newc >= 0 && newc < maxc
					&& !visited[newr][newc] && graph[newr][newc] == 1) {
				blobs.set(counter, blobs.get(counter) + 1);
				dfs(newr, newc);
			}

		}

	}
}
