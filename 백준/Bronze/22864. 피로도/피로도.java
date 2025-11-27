import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exhaust = 0;
        int jobsDone = 0;
        String[] inputs = br.readLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int C = Integer.parseInt(inputs[2]);
        int M = Integer.parseInt(inputs[3]);

        for (int i = 0; i < 24; i++) {

                if (exhaust + A <= M) {

                    exhaust += A;
                    jobsDone += B;

                } else if (exhaust + A > M) {
                    exhaust = exhaust - C;

                    if (exhaust < 0) {
                        exhaust = 0;
                    }

                }
        }
            System.out.println(jobsDone);
    }
}