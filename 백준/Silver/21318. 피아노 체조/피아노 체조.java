import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] pianos = new int[N + 1];
        int[] arr = new int[N + 1];

        StringBuilder sb = new StringBuilder();

        String[] lines = br.readLine().split(" ");

        for (int i = 0; i < N ; i++) {
            pianos[i + 1] = Integer.parseInt(lines[i]);
        }

        int Q = Integer.parseInt(br.readLine());



        for (int i = 1; i < N; i++) {

            int isMistake = 0;
            if (pianos[i] > pianos[i + 1]) {
                arr[i] = arr[i-1] + 1;
            } else {
                arr[i] = arr[i-1];
            }
        }

        arr[N] = arr[N-1];

        for (int i = 0; i < Q; i++) {

            String[] inputs = br.readLine().split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);

            sb.append(arr[y - 1] - arr[x - 1]).append("\n");

        }

        System.out.println(sb);

    }
}