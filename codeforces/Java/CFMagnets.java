package CodeForces;
import java.io.*;
import java.util.*;
public class CFMagnets {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int magnets = Integer.parseInt(br.readLine());
		int count=1;
		int prev= Integer.parseInt(br.readLine());
		for(int i =1;i<magnets;i++){
			int next = Integer.parseInt(br.readLine());
			if(next!=prev)
				count++;
			prev=next;
			
		}
		System.out.println(count);
		
	}

}
