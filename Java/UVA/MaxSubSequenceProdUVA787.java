package UVA;
import java.util.*;
import java.io.*;

public class MaxSubSequenceProdUVA787 {//wrong solution
	static int prods[];
	static int dp[][];
	static ArrayList<Integer> products;
	static ArrayList<Integer> tops;
	static int INF = Integer.MAX_VALUE - 1000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		products = new ArrayList<Integer>();

		int index = 0;
		products.add(Integer.parseInt(st.nextToken()));
		while (true) {
			int input = Integer.parseInt(st.nextToken());

			if (input == -999999)
				break;
			else if (input <= 0) {
				products.add(input);
				index++;
			} else {
				if (products.get(index) <= 0) {
					products.add(input);
					index++;
				} else {
					products.set(index, products.get(index) * input);

				}
			}
		}

		System.out.println(maxprod());

	}

	public static int maxprod() {
		int sum = 1;
		int ans = -INF;
		int negative = 0;
		tops = new ArrayList<Integer>();
		for (int i = 0; i < products.size(); i++) {
			sum *= products.get(i);
			
			System.out.println(sum);
			if (sum < 0) {
				if (i + 1 < products.size()) {
					if (!(products.get(i + 1) < 0))
						if (i + 2 < products.size()) {
							if (!(products.get(i + 2) < 0)) {
								sum = 1;
							}
						}

				}

			}
			//tops.add()

		}
		return ans;
	}
}
