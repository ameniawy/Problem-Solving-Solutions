package UVA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UVA12482ShortStoryCompetition {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (br.ready()) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());// number of words
			int L = Integer.parseInt(st.nextToken());// max number of lines per
														// page
			int C = Integer.parseInt(st.nextToken());// max number of chars per
														// line
			int lines = 1;
			int chars = 0;

			StringTokenizer sentence = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				String word = sentence.nextToken();
				int length = word.length() + 1;
				if (i + 1 == N)
					length--;
				if (length - 1 == C - chars) {
					chars = 0;
					lines++;
				} else if (length > C - chars) {
					lines++;
					chars = length;
				} else
					chars += length;

			}

			int pages = 0;
			if (lines % L == 0)
				pages = lines / L;
			else
				pages = (lines / L) + 1;

			System.out.println(pages);

		}
	}

}
