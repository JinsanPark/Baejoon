import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N + 1][N + 1];
        visited = new boolean[N + 1][N + 1];
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= N; i++) {

            String[] input = br.readLine().split("");

            for(int j = 1; j <= N; j++) {

                map[i][j] = Integer.parseInt(input[j - 1]);

            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {

                if (map[i][j] == 1 && !visited[i][j]) {

                    count = 0;
                    dfs(i, j);
                    resultList.add(count);

                }

            }
        }

        System.out.println(resultList.size());
        Collections.sort(resultList);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.println(resultList.get(i));
        }

    }

    public static void dfs(int x, int y) {

        visited[x][y] = true;
        count++;

        for (int k = 0; k < 4; k++) {

            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx > 0 && nx <= N && ny > 0 && ny <= N) {

                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }

            }


        }

    }

}