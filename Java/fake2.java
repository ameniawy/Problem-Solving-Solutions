import java.io.*;
import java.util.*;
public class fake2 {
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int tries=0;
		Map<String, String> values = new HashMap<String, String>();//i created THIS
		
		for(int i =1;i<b.length();i++){
			int len[]= new int[b.length()];
			
			for(int j=i+1;j<=b.length();j++){
				len[0]=i;
				len[1]=j;
				int counter=2;
				while(len[counter-1]+len[counter-2]<=b.length()){
					len[counter]=len[counter-1]+len[counter-2];
					counter++;
				}
				len[counter]=-1;
				String code = "";
				for (int k = 0; k < len.length && len[k]!=-1; k++) {
					code+=b.charAt(len[k]-1);
				}
				
				if(!(values.containsKey(code))){//to check here O(1)
					tries++;
					values.put(code, code);
				}
			}
			
		}
		System.out.println(tries);
		
	}

}


