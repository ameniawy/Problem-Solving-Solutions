import java.io.*;
import java.util.*;
public class fake {
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		int tries=0;
		Map<String, String> values = new HashMap<String, String>();//i created THIS
		
		for(int i =1;i<b.length();i++){
			int len[]= new int[b.length()];
			
			for(int j=i+1;j<=b.length();j++){
				String code = "";
				len[0]=i;
				len[1]=j;
				int el1=i;
				int el2=j;
				code+=b.charAt(el1-1) + b.charAt(el2-1);
				int counter=2;
				while(el1+el2<=b.length()){
					int temp = el2;
					el2=el1+el2;
					code+=b.charAt(el2-1);
					el1=temp;
					
					counter++;
				}
				len[counter]=-1;
				code = "";
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
