import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int searchNum = Integer.parseInt(br.readLine());
        int[][] matrix = new int[N][N];

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        int currentRow = N / 2;
        int currentCol = N / 2;

        int currentNum = 1;

        int direction = 0;
        int moveCount = 1;
        int directionChangeCount = 0;

        matrix[currentRow][currentCol] = currentNum;
        currentNum++;

        while (currentNum <= N * N) {

            for (int i = 0; i < moveCount; i++) {

                currentRow += dr[direction];
                currentCol += dc[direction];

                matrix[currentRow][currentCol] = currentNum;
                currentNum++;

                if (currentNum > N * N) {
                    break;
                }
            }


            direction = (direction + 1) % 4;
            directionChangeCount++;

            if (directionChangeCount == 2) {
                moveCount++;
                directionChangeCount = 0;
            }
        }

        int searchRow = 0;
        int searchCol = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == searchNum) {
                    searchRow = i + 1;
                    searchCol = j + 1;
                    break;
                }
            }
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(searchRow + " " + searchCol);

        

    }
}