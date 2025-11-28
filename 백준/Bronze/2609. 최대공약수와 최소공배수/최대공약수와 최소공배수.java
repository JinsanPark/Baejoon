import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int greatestCommonDivisor = 0;
        int leastCommonMultiple = 1;

        if (M > N) {
            greatestCommonDivisor = N;
        } else {
            greatestCommonDivisor = M;
        }

        while (true) {

            if (N % greatestCommonDivisor == 0 && M % greatestCommonDivisor == 0) {
                sb.append(greatestCommonDivisor + "\n");
                break;
            } else {
                greatestCommonDivisor--;
            }

        }

        leastCommonMultiple = (N * M) / greatestCommonDivisor;

        sb.append(leastCommonMultiple);

        System.out.println(sb);

    }
}