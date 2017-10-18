package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EduVolBITA {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long x = Long.parseLong(""+st.nextToken());
		PrintWriter out = new PrintWriter(System.out);
		if(x==1)
			out.println(5);
		else
			out.println(25);
		
		out.flush();
		out.close();
	}

}
