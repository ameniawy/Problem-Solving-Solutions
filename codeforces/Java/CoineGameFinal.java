package CodeForces;
import java.io.*;
public class CoineGameFinal {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int swaps = 0;
		int swaps2 = 0;
		int tempcount = 0;
		int tempcount2 = 0;
		for (int i = word.length() - 1; i >= 0; i--) {
			if (word.charAt(i) == '1') {
				tempcount++;
				swaps2 += tempcount2;
			} else {
				swaps += tempcount;
				tempcount2++;
			}
		}
		System.out.println(Math.min(swaps, swaps2));
	}
}