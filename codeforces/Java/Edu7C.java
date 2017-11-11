package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Edu7C {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		int a[] = new int[n + 1];
		int next[] = new int[n+1];
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < a.length; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		next[a.length-1]=-1;
		for(int i =a.length-2;i>0;i--){
			if(a[i]!=a[i+1])
				next[i]=i+1;
			else
				next[i]=next[i+1];
			
		}
		
		
		for(int i=0;i<q;i++){
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			if(a[l]!=x)
				out.println(l);
			else if(next[l]>r)
				out.println(-1);
			else
				out.println(next[l]);
			
		}
		out.flush();
		out.close();
		
	}

}
