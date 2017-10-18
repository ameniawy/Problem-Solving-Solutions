import java.io.*;
import java.util.*;
public class AnB {
	public static void  main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[]= new int[n];
		for(int i=0;i<n;i++)
			a[i]= Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		
		
		
		
	}

}
