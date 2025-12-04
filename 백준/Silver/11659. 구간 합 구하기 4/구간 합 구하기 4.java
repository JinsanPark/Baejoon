import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {



        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] sum = new int[N + 1];
        String[] nums = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            int cNum = Integer.parseInt(nums[i - 1]);

            sum[i] = sum[i - 1] + cNum;
        }


        for (int k = 0; k < M; k++) {

            String[] line = br.readLine().split(" ");
            int i = Integer.parseInt(line[0]);
            int j = Integer.parseInt(line[1]);
            sb.append(sum[j] - sum[i - 1]).append("\n");
        }

        System.out.println(sb);

    }
}