public class DP {// top-down DP
	static int f[];
	static int n;
	static int wt[];
	static int val[];
	static int inf = (int) Math.pow(10, 6);
	static int dp[][];

	public static void main(String[] args) throws Exception {
		f = new int[n + 1];
		int maxweight=0;
		for(int i=0;i<wt.length;i++)
			maxweight+=wt[i];
		dp = new int[n][maxweight];

	}

	public static int dp(int w, int i) {
		if (i == n || w == 0)
			return 0;
		if (w < 0)
			return -inf;
		if (dp[w][i] != -1)
			return dp[w][i];

		dp[w][i] = Math.max(dp(w, i + 1), dp(w - wt[i], i + 1) + val[i]);
		
		return dp[w][i];

	}
}
