import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("stations.in"));

        PrintWriter out = new PrintWriter(System.out);
        int test_cases = Integer.parseInt(br.readLine());

        while(test_cases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line = br.readLine();
            int crosses = 0;
            for(int i = 0; i < n; i++) {
                if(line.charAt(i) == '+') {
                    crosses++;
                }
            }
            // out.println("n is " + n);
            // out.println("crosses are " + crosses);
            int x = (int) Math.ceil((n - crosses) / ((2 * crosses) + 0.0 ) );

            out.println(x);


        }


        out.flush();
        out.close();

    }
}