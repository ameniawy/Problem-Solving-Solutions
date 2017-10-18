package UVA;
import java.io.*;
import java.util.*;

public class UVA10140 {//TLE yabnel weskha
	static int from;
	static int to;
	static int INF = Integer.MAX_VALUE - 1000;
	static ArrayList<Integer> primes;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			from = Integer.parseInt(st.nextToken());
			to = Integer.parseInt(st.nextToken());
			primes = new ArrayList<Integer>();

			if (from == to)
				System.out.println("There are no adjacent primes.");
			else {

				generatePrimes();
				if (primes.size() <= 1)
					System.out.println("There are no adjacent primes.");
				else {
					int maxdistance = -INF;
					int max1 = 0;
					int max2 = 0;
					int mindistance = INF;
					int min1 = 0;
					int min2 = 0;
					for (int i = 0; i < primes.size() - 1; i++) {
						if ((primes.get(i + 1) - primes.get(i)) > maxdistance) {
							max1 = primes.get(i);
							max2 = primes.get(i + 1);
							maxdistance = primes.get(i + 1) - primes.get(i);
						}
						if ((primes.get(i + 1) - primes.get(i)) < mindistance) {
							min1 = primes.get(i);
							min2 = primes.get(i + 1);
							mindistance = primes.get(i + 1) - primes.get(i);

						}

					}
					System.out.println(min1 + "," + min2 + " are closest, "
							+ max1 + "," + max2 + " are most distant");
				}

			}
		}

	}

	public static void generatePrimes() {
		for (int i = from; i <= to; i++) {
			if (isPrime(i))
				primes.add(i);
		}
		if (primes.get(0) == 1)
			primes.remove(0);

	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

}
