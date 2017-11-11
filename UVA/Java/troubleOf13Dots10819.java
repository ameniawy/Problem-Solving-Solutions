import java.io.*;
import java.util.*;

public class troubleOf13Dots10819 {

    static int[] price;
    static int[] value;
    static int M, N;
    static int eBudget;
    static boolean risk;
    static int memo[][];


    public static int dp(int idx, int money) {
        if(money == 0) return 0;
        if(money < 0) return -100000;

        if(idx == N) {
			if(risk)
			{
				int bought = eBudget - money;
				if(bought<=M || bought > 2000)  // if what we bought is within the original budget, or greater than 2000, which grants us an extra 200
					return 0;
				return -100000;  // if not, then path is invalid because we bought > Org budget, and less than 2000
			}
			return 0;
        }

        if(memo[idx][money] != -1){
            return memo[idx][money];
        }

        int take = value[idx] + dp(idx+1, money - price[idx]);
        int leave = dp(idx+1, money);

        return memo[idx][money] = Math.max(take, leave);

    }


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        // int count = 0;

        while (sc.ready()) {
            // if(count != 0) out.println();
            // count++;
            M = sc.nextInt();
            N = sc.nextInt();
            if (M > 1800) {
                eBudget = M + 200;
                risk = true;
            }
            else {
                eBudget = M;
                risk = false;
            }

            price = new int[N];
            value = new int[N];
            memo = new int[N][eBudget+1];
            for(int i = 0; i < N; i ++) Arrays.fill(memo[i], -1);

            for(int q = 0; q < N; q++) {
                price[q] = sc.nextInt();
                value[q] = sc.nextInt();
            }
            sb.append(dp(0,eBudget) + "\n");

        }
        out.print(sb);

        out.flush();
        out.close();
    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader s) throws FileNotFoundException {
            br = new BufferedReader(s);
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }
}