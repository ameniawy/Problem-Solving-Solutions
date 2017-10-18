package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class UVA10976FractionsAgain {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			int k = Integer.parseInt(br.readLine());
			int y = k + 1;
			ArrayList<Integer> xx = new ArrayList<Integer>();
			ArrayList<Integer> yy = new ArrayList<Integer>();
			while (y <= k * 2) {
				double result = ((k * y) * 1.0) / (y - k);
				if (result == (int) result) {
					xx.add((int) result);
					yy.add(y);
				}
				y++;

			}
			int num = xx.size();
			Collections.sort(xx, Collections.reverseOrder());
			Collections.sort(yy);

			System.out.println(num);
			for (int i = 0; i < num; i++)
				System.out.println("1/" + k + " = 1/" + xx.get(i) + " + 1/"
						+ yy.get(i));

		}
	}

}
