package CodeForces;

import java.util.*;
public class Diplomas {
	public static void main(String[]args)throws Exception{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int min1=sc.nextInt();
		int max1=sc.nextInt();
		int min2=sc.nextInt();
		int max2=sc.nextInt();
		int min3=sc.nextInt();
		int max3=sc.nextInt();
		
		int first = Math.min(n-min2-min3, max1);
		int second = Math.min(n-first-min3, max2);
		int third=n-first-second;
		
		System.out.print(first+" "+second+" "+third);
		
		
	}

}
