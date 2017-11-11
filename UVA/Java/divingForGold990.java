import java.io.*;
import java.util.*;

public class divingForGold990 {

    static int[] value;
    static int[] depth;
    static int memo[][];
    static int tankCap;
    static int w;
    static int N;
    static boolean taken[][];
    static boolean mark[];
    static PrintWriter out;

    static Queue<String> q;
    // static ArrayList<Integer> solutions;

    public static int dp(int remAir, int i) {
        if (i == N || remAir == 0)
            return 0;

        else if (memo[remAir][i] != -1) {
            return memo[remAir][i];
        }
        else if(depth[i] > remAir) {
            return dp(remAir, i + 1);
        }
        else {
            int a = value[i] + dp(remAir-depth[i],i + 1);
            int b = dp(remAir, i + 1);

            return memo[remAir][i] = Math.max(a, b);
        }

        // if (cost > remAir) {
        //     return dp(remAir, i+1);
        // }

    }

    public static void printDP(int remAir, int i) {
        if (i == N || remAir == 0)
            return;

        if(depth[i] > remAir) {
            printDP(remAir, i + 1);
            return;
        }

        int a = dp(remAir, i + 1);
        int b = value[i] + dp(remAir - depth[i], i + 1);

        if(b >= a) {
            String print = (depth[i]/3/w) + " " + value[i];
            q.add(print);
            printDP(remAir - depth[i], i + 1);
            return;
        }
        else {
            printDP(remAir, i + 1);
            return;           
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int count = 0;

        while (sc.ready()) {
            if(count > 0) {
                out.println();
            }
            count++;
            tankCap = sc.nextInt();
            w = sc.nextInt();
            N = sc.nextInt();

            memo = new int[1010][1010];
            value = new int[N];
            depth = new int[N];
            for (int i = 0; i < memo.length; i++) {
                for (int j = 0; j < memo[i].length; j++) {
                    memo[i][j] = -1;
                }
            }

            for (int p = 0; p < N; p++) {
                depth[p] = sc.nextInt() * 3 * w;
                value[p] = sc.nextInt();
            }

            q = new LinkedList<String>();

            out.println(dp(tankCap, 0));
            printDP(tankCap, 0);
            out.println(q.size());

            while(!q.isEmpty()) {
                out.println(q.remove());
            }

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