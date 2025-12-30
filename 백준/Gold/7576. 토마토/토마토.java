import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int M, N;
    static int[][] map;
    static boolean visited[][];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int day;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

       M = Integer.parseInt(st.nextToken());
       N = Integer.parseInt(st.nextToken());
       day = 0;

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {

            String[] line = br.readLine().split(" ");

            for (int j = 0; j < M; j++) {

                map[i][j] = Integer.parseInt(line[j]);

                if (map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    q.add(new int[]{i, j});
                }

            }
        }

        bfs();

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                if (map[i][j] == 0){
                    System.out.println(-1);
                    return;
                }

                if (map[i][j] > day) {
                    day = map[i][j];
                }

            }

        }

        System.out.println(day - 1);

    }

    public static void bfs() {

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {

                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < M && !visited[nextX][nextY] && map[nextX][nextY] == 0) {
                    visited[nextX][nextY] = true;


                        map[nextX][nextY] = map[curX][curY] + 1;


                    q.add(new int[]{nextX, nextY});

                }
            }
            
        }
    }
}