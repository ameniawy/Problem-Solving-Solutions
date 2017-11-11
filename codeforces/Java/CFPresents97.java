package CodeForces;
import java.util.*;
import java.io.*;
public class CFPresents97 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int []p= new int[size+1];
		for(int i=1;i<p.length;i++){
			p[i]=Integer.parseInt(st.nextToken());
		}
		String out="";
		for(int i=1;i<p.length;i++){
			
			for(int j=1;j<p.length;j++){
				if(p[j]==i){
					out=out+j+" ";
					break;
				}
					
			}
		}
		System.out.println(out);
		
	}

}
