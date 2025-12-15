import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static int[][] map;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int M,N;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {

            String[] line = br.readLine().split("");

            for (int j = 0; j < M; j++) {

                map[i][j] = Integer.parseInt(line[j]);

            }
        }

        bfs(0, 0);


        System.out.println(map[N - 1][M - 1]);


    }

    public static void bfs(int x, int y) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visited[x][y] = true;


        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int cx = cur[0];
            int cy = cur[1];


            for (int k = 0; k < 4; k++) {

                int nx = cx + dx[k];
                int ny = cy + dy[k];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (map[nx][ny] == 1 && !visited[nx][ny]) {

                        map[nx][ny] = map[cx][cy] + 1;

                        visited[nx][ny] = true;
                        q.add(new int[]{nx, ny});
                    }
                }
            }

        }
    }

}