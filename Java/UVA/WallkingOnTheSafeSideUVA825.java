package UVA;
import java.util.*;
import java.io.*;

public class WallkingOnTheSafeSideUVA825 {
	static int w;
	static int n;
	static int graph[][];
	static int dp[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		br.readLine();
		for (int q = 0; q < tests; q++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			graph = new int[w + 1][n + 1];
			dp = new int[w + 1][n + 1];
			for (int i = 0; i <= w; i++) {
				Arrays.fill(dp[i], -1);
			}
			for (int i = 1; i <= w; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				st2.nextToken();
				while (st2.hasMoreTokens()) {
					int col = Integer.parseInt(st2.nextToken());
					graph[i][col] = -1;
				}
			}
			int num = walk(1, 1);

			if (q + 1 == tests)
				System.out.println(num);
			else {
				System.out.println(num);
				System.out.println();
			}
			if (q + 1 != tests)
				br.readLine();

		}
	}

	public static int walk(int x, int y) {
		if (x == w && y == n) {
			return 1;
		}
		if (x > w || y > n) {
			return 0;
		}
		if (graph[x][y] == -1)
			return 0;
		if (dp[x][y] != -1) {
			return dp[x][y];
		} else {
			int ans = walk(x + 1, y) + walk(x, y + 1);
			return dp[x][y] = ans;
		}

	}

}
