package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA11565SimpleEquations {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int q = 0; q < tests; q++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			boolean flag = false;
			loop: {
				for (int x = -100; x <= 100; x++) {
					for (int y = -100; y <= 100; y++) {
						for (int z = -100; z <= 100; z++) {
							if (x != y && x != z && y != z && x + y + z == a
									&& x * y * z == b
									&& x * x + y * y + z * z == c) {
								flag = true;
								System.out.println(x + " " + y + " " + z);
								break loop;
							}

						}
					}
				}
			}
			if (!flag)
				System.out.println("No solution.");
		}

	}

}
