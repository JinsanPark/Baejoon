import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] line = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N ; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int currentSum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {

            currentSum += line[i];

            while (currentSum >= S) {

                min = Math.min(min, i - start + 1);

                currentSum -= line[start];
                start++;
            }


        }

        if (min == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(min);
        }

    }
}