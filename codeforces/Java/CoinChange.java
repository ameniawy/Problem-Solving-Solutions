package CodeForces;
import java.util.Arrays;

public class CoinChange {
	static int coins[];
	static int n;
	static int inf =(int) Math.pow(10, 6);
	static int dp[][];
	static int money;

	public static void main(String[]args)throws Exception{
		coins =  new int[n];
		dp = new int [n][money];
		for(int i = 0;i<n;i++)
			Arrays.fill(dp[i], -1);
		change(0,money);
		
		
	}
	public static int change(int i, int rem){
		if(rem<0)
			return inf;
		if(rem==0)
			return 0;
		if(i==n){
			if(rem==0)
				return 0;
			else
				return inf;
		}
		
		
		Math.min(change(i+1,rem),change(i,rem-coins[i])+1);
		return dp[i][rem];
	}
}
