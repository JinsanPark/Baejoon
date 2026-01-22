import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] A = new int[N + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N ; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int start = 1;
        int count = 0;
        int currentSum = 0;
        for (int i = 1; i <= N; i++) {

            currentSum += A[i];

            while (currentSum > M) {
                currentSum -= A[start];
                start++;
            }

            if (currentSum == M) {
                count++;
            }

        }

        System.out.println(count);

    }
}