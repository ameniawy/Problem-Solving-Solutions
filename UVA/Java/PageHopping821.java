import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class PageHopping821 {

    static PrintWriter out;
    static ArrayList<Integer>[] adjList;
    static int d[][];

    public static void floyd() {
        d = new int[101][101];

        for(int i = 0; i < 101; i++) {
            for(int j = 0; j < 101; j++) {
                if(adjList[i].contains(j)) {
                    d[i][j] = 1;
                }
                else {
                    d[i][j] = 9999999; // INF
                }
            }
        }

        for(int k = 1; k < 101; k ++) {
            for(int i = 1; i < 101; i++) {
                for(int j = 1; j < 101; j++) {
                    d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        boolean start = true;
        int iter = 1;

        loop:
        while(true) {
            adjList = new ArrayList[101];
            for (int i = 0; i < adjList.length; i++) {
                adjList[i] = new ArrayList<Integer>();
            }

            while (true) {
                int i = sc.nextInt();
                int j = sc.nextInt();
                if(i == 0 && j == 0 && start) break loop;
                if(i == 0 && j == 0) break;
                start = false;

                adjList[i].add(j);

            }
            start = true;
            floyd();

            double sum = 0;
            double count = 0;
            for(int i = 1; i < 101; i++) {
                for(int j = 1; j < 101; j++) {
                    if(d[i][j] != 9999999 && i != j) {
                        count++;
                        sum += d[i][j];
                    }
                    
                }
            }
            double dd = (sum/(count));
            out.printf("Case %d: average length between pages = %.3f clicks\n", iter, dd);
            iter++;


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