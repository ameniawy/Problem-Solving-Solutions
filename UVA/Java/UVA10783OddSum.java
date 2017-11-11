package UVA;
import java.util.*;
import java.io.*;
public class UVA10783OddSum {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i =1;i<=tests;i++){
			int low = Integer.parseInt(br.readLine());
			int high = Integer.parseInt(br.readLine());
			if(low%2==0)
				low++;
			int sum =0;
			for(int j =low;j<=high;j+=2)
				sum+=j;
			System.out.println("Case "+i+": "+sum);
			
		}
		
		
	}

}
