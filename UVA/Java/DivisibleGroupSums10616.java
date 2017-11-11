import java.io.*;
import java.util.*;

public class DivisibleGroupSums10616 {

    static PrintWriter out;
    static long memo[][][];
    static int N;
    static int D;
    static int nums[];

    public static long dp(int idx, int mod, int rem) {

        if (rem == 0) {
            if (mod == 0)
                return 1;
            else
                return 0;
        }
        if (idx == N)
            return 0;

        if (memo[idx][rem][mod] != -1) {
            return memo[idx][rem][mod];
        }
        // as the sum can be negative, taking modulo twice
        long take = dp(idx + 1, (((mod + nums[idx]) % D) + D) % D, rem - 1);
        long leave = dp(idx + 1, mod, rem);
        return memo[idx][rem][mod] = take + leave;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int setN = 1;

        while (true) {
            N = sc.nextInt();
            int Q = sc.nextInt();
            if (N == 0 && Q == 0)
                break;

            nums = new int[N];

            // N numbers
            for (int j = 0; j < N; ++j) {
                nums[j] = sc.nextInt();
            }

            out.printf("SET %d:\n", setN++);
            for (int j = 1; j <= Q; ++j) {
                D = sc.nextInt();
                int M = sc.nextInt();
                memo = new long[N][M + 1][D];
                for (int i = 0; i < N; ++i)
                    for (int q = 0; q < M + 1; ++q)
                        Arrays.fill(memo[i][q], -1);
                out.printf("QUERY %d: %d\n", j, dp(0, 0, M));
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