import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] line = new int[N];
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {

            line[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(line);

        int left = 0;
        int right = N - 1;

        while (left < right) {

            if (line[left] + line[right] == M) {
                count++;
                left++;
            } else if (line[left] + line[right] < M) {
                left++;
            } else if (line[left] + line[right] > M) {
                right--;
            }

        }

        System.out.println(count);


    }
}