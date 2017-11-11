package UVA;
import java.util.*;
import java.io.*;

public class HowDoYouAddUVA10943 {
	static int dp[][];

	public static void main(String[] args) throws Exception {
		dp = new int[101][101];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i <= 100; i++)
			Arrays.fill(dp[i], -1);
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			if (n == 0 && k == 0)
				break;
			
			System.out.println(howMany(n, k));
		}
		
		
	}

	public static int howMany(int n, int k) {
		if (k == 0) {
			if (n == 0)
				return 1;
			else
				return 0;
		}

		if (dp[n][k] != -1)
			return dp[n][k];

		int ans = 0;

		for (int i = 0; i <= n; i++) {

			ans += howMany(n - i, k - 1);
			ans %= 1000000;

		}
		return dp[n][k] = ans;

	}

}
