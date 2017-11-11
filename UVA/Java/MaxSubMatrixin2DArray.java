package UVA;
import java.util.*;
import java.io.*;

public class MaxSubMatrixin2DArray {
	static int rows;
	static int cols;
	static int matrix[][];
	static int temp[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		cols = rows;
		matrix = new int[rows][cols];
		temp = new int[rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		int max = maxsum();
		System.out.println(max);

	}

	public static int maxsum() {
		int absMAX = 0;
		for (int left = 0; left < cols; left++) {// loop for left
			for (int right = left; right < cols; right++) {// loop for right
				for (int i = 0; i < temp.length; i++) {// now fill temp array
														// with current col
					temp[i] += matrix[i][right];
				}
				int sum = 0;
				int ans = 0;

				for (int i = 0; i < temp.length; i++) {// apply kadhan on temp
														// array
					sum += temp[i];
					ans = Math.max(sum, ans);

					if (sum < 0) {
						sum = 0;
					}

				}
				absMAX = Math.max(absMAX, ans);

			}
			Arrays.fill(temp, 0);
		}
		return absMAX;
	}

}
