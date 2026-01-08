import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] matrix;
    static int N;
    static StringBuilder st;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];
        st = new StringBuilder();

        for (int i = 0; i < N; i++) {

            String inputs = br.readLine();

            for (int j = 0; j < N; j++) {
                matrix[i][j] = inputs.charAt(j) - '0';
            }

        }

        partition(0,0, N);
        System.out.println(st);

    }

    public static void partition(int row, int col, int size) {

        if (check(row, col, size)) {
            st.append(matrix[row][col]);
            return;
        }

        st.append("(");

        int newSize = size / 2;

        partition(row,col,newSize);
        partition(row,col + newSize,newSize);
        partition(row + newSize ,col,newSize);
        partition(row + newSize ,col + newSize ,newSize);


        st.append(")");
    }

    public static boolean check(int x, int y, int length) {

        for (int i = x; i < x + length; i++) {
            for (int j = y; j < y + length; j++) {

                if (matrix[x][y] != matrix[i][j]) {
                    return false;
                }

            }
        }

        return true;

    }

}