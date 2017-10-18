package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA11679SubPrime {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int banks = Integer.parseInt(st.nextToken());
			int debts = Integer.parseInt(st.nextToken());
			if (banks == 0 && debts == 0)
				break;
			int balance[] = new int[banks + 1];
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int i = 1; i < balance.length; i++) {
				balance[i] = Integer.parseInt(st2.nextToken());
			}
			boolean flag = true;
			for (int i = 0; i < debts; i++) {
				StringTokenizer st3 = new StringTokenizer(br.readLine());
				int debtor = Integer.parseInt(st3.nextToken());
				int creditor = Integer.parseInt(st3.nextToken());
				int value = Integer.parseInt(st3.nextToken());
				balance[debtor] = balance[debtor] - value;
				balance[creditor] = balance[creditor] + value;
			}
			for(int i =1;i<balance.length;i++){
				if(balance[i]<0)
					flag=false;
			}
			if (flag)
				System.out.println("S");
			else
				System.out.println("N");

		}
	}

}
