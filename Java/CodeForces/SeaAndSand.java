package CodeForces;
import java.util.*;
public class SeaAndSand {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		String line =sc.nextLine();
		StringTokenizer st = new StringTokenizer(line);
	
		int n=Integer.parseInt(st.nextToken()); 
		int k=Integer.parseInt(st.nextToken());
		if(k<= ((n*n)+1)/2){
			System.out.println("YES");
			
			for(int i =1;i<=n;i++){
				for(int j=1;j<=n;j++){
					if((i+j)%2==0 && k>0){
						System.out.print("L");
						k--;
					}
					else{
						System.out.print("S");
					}
					
				}
				System.out.println();
			}
		}
		else{
			System.out.println("NO");
		}
	}

}
