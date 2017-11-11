import java.io.*;
import java.util.*;

public class QueriesB {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int aSize = Integer.parseInt("" + st.nextToken());
		int bSize = Integer.parseInt("" + st.nextToken());
		StringTokenizer sta = new StringTokenizer(br.readLine());
		int[] a = new int[aSize];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt("" + sta.nextToken());
		}
		StringTokenizer stb = new StringTokenizer(br.readLine());
		int[] b = new int[bSize];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt("" + stb.nextToken());
		}
		Arrays.sort(a);
		String output = "";
		for (int i = 0; i < b.length; i++) {
			int temp = b[i];
			int count = 0;
			for (int j = a.length - 1; j >= 0; j--) {
				if (temp >= a[j]) {
					count = j+1;
					for(int z =j-2;z>=0;z--){
						if(a[z]==temp)
							count++;
						else
							break;
					}
						
					break;
				}
			}
			output = output + (count) + " ";
		}
		System.out.println(output);

	}

}
