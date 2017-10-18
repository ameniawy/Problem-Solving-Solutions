package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edu7B {
	static int m;
	static int h;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int a = Integer.parseInt(br.readLine());
		
		if (line.charAt(0) == '0')
			h = Integer.parseInt("" + line.charAt(1));
		else
			h = Integer.parseInt(line.charAt(0) + "" + line.charAt(1));
		if (line.charAt(3) == '0')
			m = Integer.parseInt("" + line.charAt(4));
		else
			m = Integer.parseInt(line.charAt(3) + "" + line.charAt(4));
		

		 while(a>0){
			 if(a<60){
				 if(a+m<60){
					 m+=a;
					 a=0;
				 }
				 else{
					 int rem = 60-m;
					 a-=rem;
					 m=0;
					 m+=a;
					 a=0;
					 if(h==23)
						 h=0;
					 else
						 h++;
				 }
				 
			 }
			 else{
				 int sample =60;
				 a-=sample;
				 
				 if(sample+m<60)
					 m+=a;
				 else{
					 int rem = 60-m;
					 sample-=rem;
					 m=0;
					 m+=sample;
					 if(h==23)
						 h=0;
					 else
						 h++;
				 }
				 
				 
			 }
		 
		
		
		 }
		
		 display();

	}
	static void display(){
		String out="";
		if(h<10)
			out= out+"0"+h+":";
		else
			out= out+h+":";
		if(m<10)
			out= out+"0"+m;
		else
			out= out+m;
		System.out.println(out);
		
	}
	

}
