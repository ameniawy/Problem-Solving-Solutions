package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UVA256QuirksomeSquares {
	public static int digits;
	public static String num;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			digits = Integer.parseInt(br.readLine());
			int range = (int) Math.pow(10, digits);
			for (int i = 0; i < range; i++) {
				if (Math.sqrt(i) == (int) Math.sqrt(i))
					if (check(i)) {
						System.out.println(num);
					}
			}
		}

	}

	public static boolean check(int n) {
		num = "" + n;
		while (num.length() < digits) {
			num = "0" + num;
		}
		String a = num.substring(0, (num.length()) / 2);
		String b = num.substring((num.length()) / 2, num.length());
		int numa = Integer.parseInt(a);
		int numb = Integer.parseInt(b);
		int result = (int) Math.pow(numa + numb, 2);
		if (result == n)
			return true;
		return false;

	}

}
