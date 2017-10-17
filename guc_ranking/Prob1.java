import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob1 {
    public static void main(String []args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("overcode.in"));
        int test_cases = Integer.parseInt(br.readLine());
        //System.out.println(test_cases);
        PrintWriter pr = new PrintWriter(System.out);

        while(test_cases-- > 0) {
            int inputs = Integer.parseInt(br.readLine());
            int arr [] = new int [inputs];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int i = 0; i < inputs; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int sol = 0;
        
            for(int i = 0; i < inputs; i++) {
                try {
                if(Math.abs(arr[i] - arr[i+5]) > 1000) {
                    continue;
                }
                else {
                    sol++;
                    i +=5;
                }
            }
            catch(Exception e) {

            }
            }
            pr.println(sol);

        }
        pr.flush();
        pr.close();
        //StringTokenizer st = new StringTokenizer();
        //int test_cases = Integer.parseInt()
    }
}