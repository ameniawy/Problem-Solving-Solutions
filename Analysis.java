import java.util.*;

/**
 * Abdelrahman Hisham El Meniawy
 * abdelrahman.hisham@student.guc.edu.eg
 * ameniawy18@gmail.com
 * 34-1203
 * T-16
 * 
 * n*l*m
 * given string length n
 * given dictionary of size l
 * given largest element length in dict m
 * 
 * complexity of DP is, size of memo * work done in function
 *      size of memo = n
 *      work done = l * m (cost of finding prefix in dictionary)
 * 
 * therefore worst time complexity is n * l * m
 */


public class Analysis {

    static String str = "";
    static String [] list;
    static int [] memo;

    public static boolean checkInList(String prefix) {
        for(String u: list) {
            if(u.equals(prefix)) {
                return true;
            }
        }
        return false;
    }

    public static boolean rec(int index) {

        if(index == str.length()) return true;
        for(int j = index; j < str.length(); j++) {

            // check memo first
            int res = -1;
            if(memo[j] != -1) {
                res = memo[j];
            }

            if(res == -1) {
                res = rec(j+1) ? 1:0;
                memo[j] = res;
            }

            String sub = str.substring(index, j+1);

            if(checkInList(sub) && (res == 1)) {
                return true;
            }
        }

        return false;
    }
    public static void main(String [] args) {

        list = new String []{"ab", "ba", "abc"};
        str = "abbaac";
        memo = new int[str.length()];
        Arrays.fill(memo, -1);
        System.out.println(rec(0));
    }
}