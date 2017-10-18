import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class BigInt {
	static long prods[];
	static int dp[][];
	static ArrayList<Integer> products;
	static int INF = Integer.MAX_VALUE - 1000;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while ((line=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(line);
			products = new ArrayList<Integer>();

			int index = 0;
			products.add(Integer.parseInt(st.nextToken()));
			while (true) {
				int input = Integer.parseInt(st.nextToken());

				if (input == -999999)
					break;
				else{
					products.add(input);
					
				} 
			}
			BigInteger max = BigInteger.valueOf(-INF);
			//System.out.println(max);
			BigInteger currentprod = BigInteger.valueOf(0l);
			for (int i = 0; i < products.size(); i++) {
				currentprod = BigInteger.valueOf(1);
				System.out.println(currentprod);
				for (int j = i; j < products.size(); j++) {
					BigInteger now = BigInteger.valueOf(products.get(j));
					currentprod = currentprod.multiply(now);
					max = max.max(currentprod);
					
				}
				
			}
			System.out.println(max);
		}
	}

}
