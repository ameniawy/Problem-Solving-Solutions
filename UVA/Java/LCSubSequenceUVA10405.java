package UVA;
import java.util.*;
import java.io.*;

public class LCSubSequenceUVA10405 {
	static String s1;
	static String s2;
	static int dp[][];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			s1 = br.readLine();
			s2 = br.readLine();
			dp = new int[s1.length()][s2.length()];
			for (int i = 0; i < s1.length(); i++)
				Arrays.fill(dp[i], -1);
			
			System.out.println(lcs(0,0));
		}

	}

	public static int lcs(int i, int j) {
		if (i >= s1.length() || j >= s2.length())
			return 0;
		if (dp[i][j] != -1)
			return dp[i][j];

		int skip1 = lcs(i + 1, j);
		int skip2 = lcs(i, j + 1);
		int equal = 0;
		if (s1.charAt(i) == s2.charAt(j))
			equal = lcs(i + 1, j + 1) + 1;

		return dp[i][j] = Math.max(equal, Math.max(skip1, skip2));

	}

}
