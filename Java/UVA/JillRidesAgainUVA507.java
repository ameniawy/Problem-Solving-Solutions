package UVA;
import java.util.*;
import java.io.*;

public class JillRidesAgainUVA507 {
	static int[] stops;
	static int start;
	static int end;
	static int max;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tests = Integer.parseInt(st.nextToken());
		for (int q = 1; q <= tests; q++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			int busstop = Integer.parseInt(st2.nextToken());
			stops = new int[busstop];
			for (int i = 1; i < busstop; i++) {
				StringTokenizer st3 = new StringTokenizer(br.readLine());
				stops[i] = Integer.parseInt(st3.nextToken());
			}
			maxsum();
			
				if (max > 0)
					System.out.println("The nicest part of route " + q
							+ " is between stops " + (start) + " and "
							+ (end + 1));
				else
					System.out.println("Route " + q + " has no nice parts");
			
			
		}
	}

	public static void maxsum() {
		int sum = 0;
		max = 0;
		start = 1;
		int starttemp = 1;
		end = 1;
		for (int i = 1; i < stops.length; i++) {
			sum += stops[i];

			if (sum > max) {
				max = sum;
				start = starttemp;
				end = i;
			}
			else if(sum==max){
				if((i-starttemp)>(end-start)){
					start = starttemp;
					end=i;
				}
			}
			if (sum < 0) {
				starttemp = i + 1;
				sum = 0;
			}
			
		}

	}

}
