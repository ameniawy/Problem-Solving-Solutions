package UVA;
import java.util.*;
import java.io.*;

public class UVA11364Parking {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for (int z = 0; z < tests; z++) {
			int shops = Integer.parseInt(br.readLine());
			int s[] = new int[shops];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < s.length; i++) {
				s[i] = Integer.parseInt(st.nextToken());

			}
			int min = 1000;
			int max = 0;
			for (int j = 0; j < s.length; j++) {
				if (s[j] > max)
					max = s[j];
				if (s[j] < min)
					min = s[j];
			}
			System.out.println((max-min)*2);
		}

	}

}
