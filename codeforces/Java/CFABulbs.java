package CodeForces;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CFABulbs {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int buttons = Integer.parseInt(st.nextToken());
		int bulbs = Integer.parseInt(st.nextToken());
		boolean arr[] = new boolean[bulbs + 1];
		for (int i = 1; i <= buttons; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st2.nextToken());
			for (int j = 0; j < num; j++) {
				int curr = Integer.parseInt(st2.nextToken());
				arr[curr] = true;

			}

		}
		if(check(arr))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

	public static boolean check(boolean[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] == false)
				return false;

		}
		return true;
	}

}
