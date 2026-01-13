import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] meetings = new int[N][2];
        int timeEnded = 0;
        int count = 0;


        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(meetings, (x,y) -> {

            if (x[1] == y[1]) {
                return x[0] - y[0];
            }

            return x[1] - y[1];

        });

        for (int i = 0; i < N; i++) {

            if (meetings[i][0] >= timeEnded) {
                count++;
                timeEnded = meetings[i][1];
            }

        }

        System.out.println(count);

    }
}