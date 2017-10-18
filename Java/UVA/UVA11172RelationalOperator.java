package UVA;
import java.util.*;
import java.io.*;
public class UVA11172RelationalOperator {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i =0;i<tests;i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			if(x>y)
				System.out.println(">");
			else if(x<y)
				System.out.println("<");
			else{
				System.out.println("=");
			}
		}
		
	}

}
