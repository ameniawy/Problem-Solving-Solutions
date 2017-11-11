package CodeForces;
import java.util.Scanner;
public class LuckyNumber { // first ever problem!
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the lucky number:");
		String lucky = sc.nextLine();
		int length = lucky.length();
		int position=0;
		int counter=0;
		for(int i=length;i>0;i--){
			if(lucky.charAt(counter)=='7'){
			position+= Math.pow(2,i-1);
			}
			counter++;
		}
		position++;
		
		int sum=0;
		for(int i=length-1;i>0;i--){
			sum+= Math.pow(2,i);
		}
		position+=sum;
		System.out.println(position);
		
	}

}
