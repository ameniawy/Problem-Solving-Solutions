import java.io.*;
import java.util.*;

public class PrimeDistanceUVA10140 {
	static int from;
	static int to;
	static int INF = Integer.MAX_VALUE - 1000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		from = Integer.parseInt(st.nextToken());
		to = Integer.parseInt(st.nextToken());
		if (from == to)
			System.out.println("There are no adjacent primes.");
		else {
			int primes[] = generatePrimes(to);
			if (primes.length <= 1)
				System.out.println("There are no adjacent primes.");
			else {
				int maxdistance = -INF;
				int max1 = 0;
				int max2 = 0;
				int mindistance = INF;
				int min1 = 0;
				int min2 = 0;
				for (int i = 0; i < primes.length - 1; i++) {
					if ((primes[i + 1] - primes[i]) > maxdistance) {
						max1 = primes[i];
						max2 = primes[i + 1];
						maxdistance = primes[i + 1] - primes[i];
					}
					if ((primes[i + 1] - primes[i]) < mindistance) {
						min1 = primes[i];
						min2 = primes[i + 1];
						mindistance = primes[i + 1] - primes[i];

					}

				}
				System.out.println(min1 + "," + min2 + " are closest, " + max1
						+ "," + max2 + " are most distant");
			}
			System.out.println(Arrays.toString(primes));
		}

	}

	public static int[] generatePrimes(int max) {
		boolean[] isComposite = new boolean[max - from + 1];
		for (int i = 0; i * i <= max; i++) {
			if (i < isComposite.length) {

				for (int j = i; i * j <= max; j++) {
					if (i == 0 || i == 1)
						break;
					if (i * j <= max && i * j >= from) {
						isComposite[i * j - from] = true;
					}

				}
			}
		}
		int numPrimes = 0;
		if (from == 1)
			isComposite[0] = true;
		for (int i = 0; i < max - from + 1; i++) {
			if (!isComposite[i])
				numPrimes++;
		}
		int[] primes = new int[numPrimes];
		int index = 0;
		for (int i = 0; i < max - from + 1; i++) {
			if (!isComposite[i])
				primes[index++] = i + from;
		}

		return primes;
	}

}
