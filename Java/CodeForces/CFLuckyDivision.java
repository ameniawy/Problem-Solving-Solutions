package CodeForces;
import java.io.*;
import java.util.*;

public class CFLuckyDivision {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int num = Integer.parseInt(word);
		int start = num;
		boolean flag = false;
		for (int i = start; i > 1; i--) {
			if (num % i == 0) {
				if (isLucky(i + "")) {
					flag = true;
					break;

				}
			}
		}
		if(flag)
			System.out.println("YES");
		else{
			System.out.println("NO");
		}
		

	}

	public static boolean isLucky(String x) {
		for (int i = 0; i < x.length(); i++) {
			if (!(x.charAt(i) == '4' || x.charAt(i) == '7'))
				return false;
		}
		return true;
	}

}
