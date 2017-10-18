package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Edu7A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long num = Long.parseLong(br.readLine());
		long sum =0;
		for(Long i =1l;i<(1000000000000000000l);i++){
			
			if(sum+i>=num)
				break;
			sum+=i;
		}
		System.out.println(num-sum);
	}

}
