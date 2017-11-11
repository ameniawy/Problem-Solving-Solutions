package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UVA725Division {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine()); 
		while (true) {
			if (x == 0)
				break;
			boolean flag = false;
			int n;
			int d = 1234;
			while (d < 49382) {
				n = d * x;
				if (n <= 98765) {
					if (check(n + "", d + "")){
						show(n + "", d + "", x + "");
						flag=true;
					}
				}
				d++;

			}
			if (!flag)
				System.out.println("There are no solutions for "+x+".");
			x=Integer.parseInt(br.readLine());
			if(x==0)
				break;
			System.out.println();

		}
		
	}

	public static boolean check(String w, String z) {
		while (w.length() < 5)
			w = "0" + w;
		while (z.length() < 5)
			z = "0" + z;
		
		boolean a[] = new boolean[10];
		for (int i = 0; i < w.length(); i++) {
			int q = Integer.parseInt("" + w.charAt(i));
			if (a[q] == true)
				return false;
			a[q] = true;

		}
		for (int i = 0; i < z.length(); i++) {
			int q = Integer.parseInt("" + z.charAt(i));
			if (a[q] == true)
				return false;
			a[q] = true;

		}

		return true;

	}

	public static void show(String x, String y, String n) {
		while (x.length() < 5)
			x = "0" + x;
		while (y.length() < 5)
			y = "0" + y;
		System.out.println(x + " / " + y + " = " + n);

	}

}
