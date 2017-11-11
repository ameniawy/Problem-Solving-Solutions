package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVA10474WhereIsMyMarble {
	public static int cases = 0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			cases++;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			if (n == 0 && q == 0)
				break;
			int[] num = new int[n];
			for (int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(num);
			System.out.println("CASE# " + cases + ":");
			for (int i = 0; i < q; i++) {
				int query = Integer.parseInt(br.readLine());
				int result = binarySearch(query, num);

				if (result < 0)
					System.out.println(query + " not found");
				else
					System.out.println(query + " found at " + result);

			}
		}
	}

	public static int binarySearch(int x, int[] num) {
		int low = 0;
		int high = num.length - 1;
		int mid = high + low / 2;
		while (low <= high) {
			if (num[mid] == x) {

				return check(mid, num) + 1;// plus one for one based solutions
			} else if (x < num[mid]) {
				high = mid - 1;

			} else {

				low = mid + 1;

			}
			mid = high + low / 2;

		}

		return -1;
	}

	public static int check(int index, int[] num) {
		int z = index;
		int x = num[index];
		if (index == 0)
			return 0;

		while (num[z - 1] == x) {
			z--;
			if (z == 0)
				return 0;
		}
		return z;

	}

}
