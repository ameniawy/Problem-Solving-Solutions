package UVA;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LargestBlockUVA10667 {
	static int graph[][];
	static int temp[];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int l = 0; l < tests; l++) {
			int size = Integer.parseInt(br.readLine());
			int xs = Integer.parseInt(br.readLine());
			graph = new int[size + 1][size + 1];

			for (int o = 0; o < xs; o++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x1 = Integer.parseInt(st.nextToken());
				int y1 = Integer.parseInt(st.nextToken());
				int x2 = Integer.parseInt(st.nextToken());
				int y2 = Integer.parseInt(st.nextToken());

				for (int i = y1; i <= y2; i++) {
					for (int j = x1; j <= x2; j++) {
						graph[j][i] = 1;
					}
				}

			}
			temp = new int[size + 1];
			int max = 0;
			int area = 0;
			for (int left = 1; left <= size; left++) {
				for (int right = left; right <= size; right++) {
					for (int i = 1; i <= size; i++) {
						temp[i] += graph[i][right];
					}

					int sum = 0;
					int range = 0;
					max = 0;//nseina nekteb el wes5a di :D

					for (int i = 1; i <= size; i++) {
						if (temp[i] == 0) {
							sum++;
							max = Math.max(sum, max);
							range = right - left + 1;

						} else {
							sum = 0;
						}

					}
					area = Math.max(area, max * range);

				}
				Arrays.fill(temp, 0);
			}
			System.out.println(area);

		}
	}

}
