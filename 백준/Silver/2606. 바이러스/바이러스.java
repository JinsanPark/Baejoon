import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int M;
    static int[][] check;
    static int count = 0;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        String[] input;
        visited = new boolean[N + 1];
        check = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {

            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            check[x][y] = 1;
            check[y][x] = 1;

        }

        dfs(1);

        System.out.println(count);

    }

    public static void dfs(int a) {

        visited[a] = true;

        for (int i = 1; i <= N; i++) {

            if (check[a][i] == 1 && !visited[i]) {
                dfs(i);
                count++;
            }

        }

    }
}