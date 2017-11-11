package CodeForces;
import java.io.*;
public class SetOfStrings {
	public static void main(String[]args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String word = br.readLine();
		int howMany = (word.length())/n;
		boolean go =true;
		
		if(n>word.length()){
			System.out.println("NO");
		}
		else{
			for(int i =0;i<word.length();i+=howMany){
				if(howMany<i){
				if(word.charAt(i)!=word.charAt(i+howMany)){
					System.out.println("NO");
					go=false;
					break;
				}
				}
			}
			if(go==true){
				System.out.println("YES");
				for(int i=0;i<word.length();i+=howMany){
					for(int j =i;j<howMany+i;j++){
						System.out.print(word.charAt(j));
					}
					System.out.println();
				
				}
			}
			
		}
		
	}

}
