package CodeForces;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class CF339B { //fail
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger x = BigInteger.valueOf(1);

		for (int i = 0; i < n; i++) {
			BigInteger z = BigInteger.valueOf(Long.parseLong(st.nextToken()));
			x = x.multiply(z);
			if(z.equals(BigInteger.valueOf(0)))
				break;

		}
		System.out.println(x);

	}

}
