package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA12455Bars {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int z = 0; z < tests; z++) {
			int num = Integer.parseInt(br.readLine());
			int size = Integer.parseInt(br.readLine());
			int a[] = new int[size];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < a.length; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			if (check(a, num))
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

	public static boolean check(int[] a, int n) {// bitmask. all possible
													// subsets
		for (int i = 0; i < (1 << a.length); i++) {
			int sum = 0;
			for (int j = 0; j < a.length; j++) {
				if ((i & (1 << j)) != 0)
					sum += a[j];

			}
			if (sum == n)
				return true;

		}
		return false;
	}

}
