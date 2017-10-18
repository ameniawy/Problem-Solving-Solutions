
import java.util.*;

public class DPLecture {
	static int dp[];
	
	public static void main(String[] args) {
		int n=16;
		dp = new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(fibonacci(n));
		
	}
	public static int fibonacci(int n){
		if(dp[n]!=-1)
			return dp[n];
		if(n<=2)
			return 1;
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}

	}

}
