package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UVA11057ExactSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] books = new int[num];
			for (int i = 0; i < books.length; i++) {
				books[i] = Integer.parseInt(st.nextToken());
			}
			int money = Integer.parseInt(br.readLine());
			Arrays.sort(books);// nlogn solution
			int maxi = 10000000;
			int maxj = 0;
			for (int i = 0; i < books.length; i++) {
				int need = money - books[i];
				int j = binarySearch(need, books);
				if (j >= 0 && i != j) {
					if ((Math.abs(j - i)) < Math.abs(maxi - maxj)) {
						maxi = i;
						maxj = j;
					}
				}
			}
			if (maxj < maxi) {
				int temp = maxj;
				maxj = maxi;
				maxi = temp;
			}
			System.out.println("Peter should buy books whose prices are "
					+ books[maxi] + " and " + books[maxj] + ".");
			System.out.println();
			if (br.ready())
				br.readLine();

		}

	}

	public static int binarySearch(int x, int[] num) {
		int low = 0;
		int high = num.length - 1;
		int mid = high + low / 2;
		while (low <= high) {
			if (num[mid] == x) {
				return mid;
			} else if (x < num[mid]) {
				high = mid - 1;

			} else {

				low = mid + 1;

			}
			mid = high + low / 2;

		}

		return -1;// not found
	}

}
