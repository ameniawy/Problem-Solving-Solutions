import java.io.*;
import java.util.*;

public class SuperSale10130 {

    static int [] price;
    static int [] weight;
    static int memo [][];
    static int N;

    public static int dp(int i, int remW) {
        if(i == N || remW == 0) {
            return 0;
        }
        if(memo[i][remW] != -1)
            return memo[i][remW];

        if(weight[i] > remW) {
            return memo[i][remW] = dp(i+1, remW);
        }

        return memo[i][remW] = Math.max(dp(i+1, remW), price[i] + dp(i+1, remW - weight[i]));
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

        int t = sc.nextInt();

        while (t-- > 0) {
            N = sc.nextInt();

            memo = new int[1010][1010];
            for(int i =0; i < memo.length; i++) {
                for(int j = 0; j < memo[i].length; j++) {
                    memo[i][j] = -1;
                }
            }
            price = new int[N];
            weight = new int[N];

            for(int p = 0; p < N; p++) {
                price[p] = sc.nextInt();
                weight[p] = sc.nextInt();
            }

            int G = sc.nextInt();
            int res = 0;

            for(int i = 0; i < G; i++) {
                int currW = sc.nextInt();
                res += dp(0, currW);
            }

            out.println(res);

        }

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