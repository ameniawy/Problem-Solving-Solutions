package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class UVA11292DragonOfLoowater {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int headN = Integer.parseInt(st.nextToken());
			int knightN = Integer.parseInt(st.nextToken());
			if (headN == 0 && knightN == 0)
				break;
			

			int heads[] = new int[headN];
			int knight[] = new int[knightN];
			for (int i = 0; i < heads.length; i++) {
				heads[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < knight.length; i++) {
				knight[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(heads);
			Arrays.sort(knight);
			int result = greedy(heads, knight);
			if (result >= 0)
				System.out.println(result);
			else
				System.out.println("Loowater is doomed!");

		}

	}

	public static boolean check(int heads[]) {
		for (int i = 0; i < heads.length; i++) {
			if (heads[i] > 0)
				return false;
		}
		return true;
	}

	public static int greedy(int heads[], int knight[]) {
		int sum = 0;
		for (int i = 0; i < knight.length; i++) {
			int height = knight[i];
			for (int j = 0; j < heads.length; j++) {
				if (height >= heads[j] && heads[j] >= 0) {
					
					sum += height;
					heads[j] = -1;
					break;
				}

			}
		}
		
		if (check(heads))
			return sum;
		return -1;
	}
}
