import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        int[] arrTime = new int[K];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < K; i++) {

            arrTime[i] = Integer.parseInt(input[i]);

        }

        Arrays.sort(arrTime);

        int[] arrWaiting = new int[K];
        int sum = 0;
        for (int i = 0; i < K; i++) {

            sum += arrTime[i];
            arrWaiting[i] = sum;

        }

        int result = Arrays.stream(arrWaiting).sum();

        System.out.println(result);

    }
}