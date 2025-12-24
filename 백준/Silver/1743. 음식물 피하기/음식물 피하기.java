import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M, K, r, c, newG, biggestG;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        biggestG = 0;

        map = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];


        for (int i = 1; i <= K; i++) {

            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            map[r][c] = 1;

        }


        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= M; j++) {


                if (!visited[i][j] && map[i][j] == 1 ) {
                   newG = bfs(i, j);

                    if (biggestG < newG) {

                        biggestG = newG;

                    }
                }

            }


        }


        System.out.println(biggestG);

    }

    public static int bfs(int x, int y) {

        visited[x][y] = true;

        int count = 1;

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{x, y});


        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];


            for (int i = 0; i < 4; i++) {

                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX > 0 && nextY > 0 && nextX <= N && nextY <= M && !visited[nextX][nextY] && map[nextX][nextY] == 1) {

                    visited[nextX][nextY] = true;
                    count++;
                    q.add(new int[]{nextX, nextY});

                }
            }
        }

        return count;

    }
}