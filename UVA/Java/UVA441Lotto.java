package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class UVA441Lotto {
	public static StringTokenizer st;
	public static int k;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		while (true) {
			ArrayList<Integer> input = new ArrayList<Integer>();
			
			
			
			while (st.hasMoreTokens())
				input.add(Integer.parseInt(st.nextToken()));

			
			for (int a = 0; a < k - 5; a++) {
				for (int b = a + 1; b < k - 4; b++) {
					for (int c = b + 1; c < k - 3; c++) {
						for (int d = c + 1; d < k - 2; d++) {
							for (int e = d + 1; e < k - 1; e++) {
								for (int f = e + 1; f < k; f++) {
									String out = input.get(a) + " "
											+ input.get(b) + " " + input.get(c)
											+ " " + input.get(d) + " "
											+ input.get(e) + " " + input.get(f);
									System.out.println(out);

								}
							}
						}
					}
				}

			}
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			if(k==0)
				break;
			System.out.println();
		}

	}

}
