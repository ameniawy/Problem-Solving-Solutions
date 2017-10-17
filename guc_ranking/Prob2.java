import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prob2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("scoreboard.in"));

        PrintWriter out = new PrintWriter(System.out);
        int test_cases = Integer.parseInt(br.readLine());

        while(test_cases-- > 0) {
            int probs = Integer.parseInt(br.readLine());
            String word = br.readLine();
            String arr [] = br.readLine().split(" ");
            boolean flags [] = new boolean[13];

            for(int i = 0; i < word.length(); i++) {
                flags[word.charAt(i) - 'A'] = true;
            }
        
            //StringTokenizer st = new StringTokenzier(br.readLine());
            int pointer = 0;
            char index = 'z';
            int max = 0;
            for(int i = 0; i < 13; i++) {
                int current = Integer.parseInt(arr[i]);
                if(current > max) {
                // out.println(current);
                    if(!flags[i]) {
                        max = current;
                        index = (char)((int)'A' + (i));
                        // out.println("Max here");
                        // out.println(max);
                    }
                    // else if ((char)((int)'A' + (i)) == word.charAt(pointer) && pointer < word.length() - 1){
                    //     pointer++;
                    // }   

                }

            }

            out.println(index);


        }

        out.flush();
        out.close();

    }
}