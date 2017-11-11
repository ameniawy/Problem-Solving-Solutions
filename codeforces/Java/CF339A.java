package CodeForces;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF339A {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long l = Long.parseLong(st.nextToken());
		long r = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());
		String result = "";
		boolean flag = false;
		int i =0;
		while(true){
			long current = (long) Math.pow(k, i);
			if (current <= r && current >= l) {
				flag = true;
				if(!(Math.pow(k,i+1)>r))
					result = result+ current+" ";
				else
					result = result+ current;
			}
			if (current > r)
				break;
			i++;

		}
		if(flag)
			System.out.println(result);
		else
			System.out.println(-1);
	}

}
