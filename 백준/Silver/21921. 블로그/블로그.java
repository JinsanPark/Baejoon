import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] viewCount = new int[N + 1];
        int count = 1;
        int sum = 0;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            viewCount[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= X; i++) {

            sum += viewCount[i];

        }

        int max = sum;

        for (int i = X + 1; i <= N; i++) {

            sum = sum - viewCount[i - X] + viewCount[i];

            if (sum > max) {
                max = sum;
                count = 1;
            } else if(sum == max) {
                count++;
            }

        }

        sb.append(max).append("\n").append(count);

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(sb);
        }

    }
}