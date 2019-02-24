import java.io.*;
import java.util.*;

public class WhatGoesUp481 {

    static PrintWriter out;
    static ArrayList<Integer> nums;
    static int N;

    public static void printDP(int remAir, int i) {


    }

    public static int LIS(int i) {
        if(i == 0) {
            return 1;
        }
        else {
            int max = -999999;
            int maxIndex = -1;
            for(int j = 0; j < i; j++) {
                if(nums.get(j) > nums.get(i)) {
                    continue;
                }
                int curr = 1 + LIS(j);
                if(curr > max) {
                    max = curr;
                    maxIndex = j;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        int count = 0;
        N = 0;
        nums = new ArrayList<Integer>();

        while (sc.ready()) {
            nums.add(sc.nextInt());
            N++;
        }
        out.println(LIS(0));



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