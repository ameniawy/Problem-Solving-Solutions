package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EduVolBITC {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt("" + st.nextToken());
		PrintWriter out = new PrintWriter(System.out);

		out.println((1l  << x + 1) - 2);

		out.flush();
		out.close();
	}

}
