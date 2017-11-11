package CodeForces;
import java.util.*;
public class TavasnNafas {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String number="";
		if(n<=10){
			
			switch(n) {
			case 0:number="zero";break;
			case 1:number ="one";break;
			case 2:number ="two";break;
			case 3:number ="three";break;
			case 4:number ="four";break;
			case 5:number ="five";break;
			case 6:number ="six";break;
			case 7:number ="seven";break;
			case 8:number ="eight";break;
			case 9:number ="nine";break;
			case 10:number ="ten";break;
			default: number=" ";break;
				
		}
			

			
		}
		else if(n<20){
			
			switch(n){
			case 11:number ="eleven";break;
			case 12:number ="twelve";break;
			case 13:number ="thirteen";break;
			case 14:number ="fourteen";break;
			case 15:number ="fifteen";break;
			case 16:number ="sixteen";break;
			case 17:number ="seventeen";break;
			case 18:number ="eighteen";break;
			case 19:number ="nineteen";break;
			default: number=" ";break;
			}
		}
		else{
			int first = n/10;
			int second= n%10;
			
			switch(first){
			case 2:number ="twenty";break;
			case 3:number ="thirty";break;
			case 4:number ="forty";break;
			case 5:number ="fifty";break;
			case 6:number ="sixty";break;
			case 7:number ="seventy";break;
			case 8:number ="eighty";break;
			case 9:number ="ninety";break;
			default: number=" ";break;
			
			}
			if(second!=0)
			 number+="-";
			switch(second){
			case 0:break;
			case 1:number +="one";break;
			case 2:number +="two";break;
			case 3:number +="three";break;
			case 4:number +="four";break;
			case 5:number +="five";break;
			case 6:number +="six";break;
			case 7:number +="seven";break;
			case 8:number +="eight";break;
			case 9:number +="nine";break;
			default: number=" ";break;
			}
			
			
			
		}
		System.out.print(number);
		
	}

}
