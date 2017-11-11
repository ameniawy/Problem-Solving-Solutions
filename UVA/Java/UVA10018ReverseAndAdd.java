package UVA;
import java.util.*;
import java.io.*;
public class UVA10018ReverseAndAdd {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		for(int i=0;i<tests;i++){
			long num = Long.parseLong(br.readLine());
			
			int tries=0;
			long current=num;
			do{
				String rev = reverse(current+"");
				
				current = current+Long.parseLong(rev);
				
				tries++;
			}while(!isPalindrome(current+""));
			
			System.out.println(tries+" "+current);
			
		}
		
		
		
	}
	public static boolean isPalindrome(String x){
		for(int i =0;i<x.length()/2;i++){
			if(x.charAt(i)!=x.charAt(x.length()-1-i))
				return false;
		}
		return true;
	}
	public static String reverse(String x){
		String out="";
		for(int i =0;i<x.length();i++){
			out =  x.charAt(i)+""+out;
		}
		
		return out;
		
	}

}
