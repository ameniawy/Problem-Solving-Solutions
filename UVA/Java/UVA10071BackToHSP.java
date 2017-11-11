package UVA;
import java.util.*;
import java.io.*;

public class UVA10071BackToHSP {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			double v = Integer.parseInt(st.nextToken());
			double t = Integer.parseInt(st.nextToken());
			double a = v / t;
			double s =  (0.5 * (a) * (2 * t) * (2 * t));
			
			System.out.println(Math.round(s));
		}
	}

}
