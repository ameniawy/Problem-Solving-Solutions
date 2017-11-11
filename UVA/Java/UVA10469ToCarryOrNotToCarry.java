package UVA;
import java.util.*;
import java.io.*;

public class UVA10469ToCarryOrNotToCarry {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int xx = Integer.parseInt(st.nextToken());
			int yy = Integer.parseInt(st.nextToken());
			String x = Integer.toBinaryString(xx);
			String y = Integer.toBinaryString(yy);
			String result = "";
			while (x.length() != y.length()) {
				if (x.length() > y.length())
					y = "0" + y;
				else
					x = "0" + x;
			}
			for (int i = 0; i < x.length(); i++) {
				if (x.charAt(i) == y.charAt(i))
					result = result + "0";
				else
					result = result + "1";
			}
			int out = Integer.parseInt(result, 2);
			System.out.println(out);
		}

	}

}
