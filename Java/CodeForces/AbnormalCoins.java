package CodeForces;
import java.io.*;

public class AbnormalCoins {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int counter = 0;
		if (n < 3)
			System.out.print(0);
		else {
			int num = 3;
			while (n > 0 && num <= n) {
				n -= num;
				num++;
				counter++;

			}
			System.out.print(counter);
		}
	}

}
