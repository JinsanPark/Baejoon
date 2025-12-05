import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {

            String[] inputMatrix = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(inputMatrix[j]);
            }
        }

        int K = Integer.parseInt(br.readLine());


        for (int a = 0; a < K; a++) {

            String[] inputForSum = br.readLine().split(" ");
            int i = Integer.parseInt(inputForSum[0]);
            int j = Integer.parseInt(inputForSum[1]);
            int x = Integer.parseInt(inputForSum[2]);
            int y = Integer.parseInt(inputForSum[3]);
            int sum = 0;


            for (int row = i - 1; row < x; row++) {
                for (int col = j - 1 ; col < y ; col++) {

                    sum += matrix[row][col];

                }
            }

            sb.append(sum).append("\n");

        }

        System.out.println(sb);

    }
}