package UVA;
import java.util.*;
import java.io.*;

public class MaxSumOnTorusUVA10827 {
	static int rows;
	static int cols;
	static int matrix[][];
	static int temp[];
	static int INF = Integer.MAX_VALUE - 1000;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();
		for (int q = 0; q < tests; q++) {
			rows = sc.nextInt();
			cols = rows;
			matrix = new int[rows][cols];
			temp = new int[rows];
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < rows; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}

			int max = maxsum();
			System.out.println(max);
		}

	}

	public static int maxsum() {
		int absMAX = -INF;
		for (int left = 0; left < cols; left++) {// loop for left

			for (int right = left; right < cols; right++) {// loop for right
				if (right + 1 == left) {
					break;
				}
				for (int i = 0; i < temp.length; i++) {// now fill temp array
														// with current col
					temp[i] += matrix[i][right];
				}
				int sum = 0;
				int ans = -INF;
				for (int i = 0; i < temp.length; i++) {

					for (int j = i; j < temp.length; j++) {
						if (j + 1 == i)
							break;
						sum += temp[j];

						ans = Math.max(sum, ans);

						if (j + 1 == temp.length) {
							j = -1;
							if (i == 0)
								break;
						}

					}
					sum = 0;

				}
				absMAX = Math.max(absMAX, ans);
				if (right + 1 == cols) {
					right = -1;
					if (left == 0)
						break;
				}

			}
			Arrays.fill(temp, 0);
		}
		return absMAX;
	}

}
