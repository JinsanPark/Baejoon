import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        int[][] matrix = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {

            String[] rowInputs = br.readLine().split(" ");

            for (int j = 1; j <= N; j++) {

                int num = Integer.parseInt(rowInputs[j - 1]);

                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1] + num;

            }
        }

        for (int i = 1; i <= M; i++) {

            String[] inputRowColSum = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputRowColSum[0]);
            int y1 = Integer.parseInt(inputRowColSum[1]);
            int x2 = Integer.parseInt(inputRowColSum[2]);
            int y2 = Integer.parseInt(inputRowColSum[3]);

            sb.append(matrix[x2][y2] - matrix[x1-1][y2] - matrix[x2][y1-1] + matrix[x1-1][y1-1]).append("\n");

        }

        System.out.println(sb);

    }
}