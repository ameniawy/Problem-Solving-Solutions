package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA750QueensChessProblem {
	public static int[] rows;
	public static int row;
	public static int col;
	public static int solutions;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int q = 0; q < tests; q++) {
			br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine());
			row = Integer.parseInt(st.nextToken());
			col = Integer.parseInt(st.nextToken());
			rows = new int[9];// 1 based
			solutions = 1;
			System.out.println("SOLN       COLUMN");
			System.out.println(" #      1 2 3 4 5 6 7 8");
			System.out.println();
			backtrack(1);
			if (q + 1 != tests)
				System.out.println();

		}
	}

	public static boolean check(int r, int c) {
		for (int prev = 1; prev < c; prev++) {
			if (rows[prev] == r
					|| Math.abs(rows[prev] - r) == Math.abs(prev - c)) {

				return false;
			}
		}
		return true;
	}

	public static void backtrack(int c) {
		if (c == 9 && rows[col] == row)
			print();
		else {
			for (int r = 1; r < 9; r++) {
				if (check(r, c)) {
					rows[c] = r;
					backtrack(c + 1);
				}
			}
		}
	}

	public static void print() {
		String out;
		if (solutions < 10)
			out = " " + solutions + "      ";
		else
			out = solutions + "      ";

		for (int i = 1; i < 9; i++) {
			if (i + 1 != 9)
				out = out + rows[i] + " ";
			else
				out = out + rows[i];
		}
		System.out.println(out);
		solutions++;

	}

}
