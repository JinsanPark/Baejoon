import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[][] map;
    static boolean visited[][];
    static boolean cbVisited[][];
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count, cbCount;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N][N];
        cbVisited = new boolean[N][N];
        count = 0;
        cbCount = 0;

        for (int i = 0; i < N; i++) {

            String[] inputColor = br.readLine().split("");

            for (int j = 0; j < N; j++) {

                if (inputColor[j].equals("R")) {
                    map[i][j] = 0;
                } else if (inputColor[j].equals("G")) {
                    map[i][j] = 1;
                } else if (inputColor[j].equals("B")) {
                    map[i][j] = 2;
                }


            }

        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }

            }

        }

        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (!visited[i][j]) {
                    cbCount++;
                    bfs(i, j);
                }

            }

        }



        System.out.print(count + " " + cbCount);

    }

    public static void bfs(int x, int y) {

        visited[x][y] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for (int i = 0; i < 4; i++) {

                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && !visited[nextX][nextY] && map[nextX][nextY] == map[curX][curY]) {

                    visited[nextX][nextY] = true;
                    q.add(new int[]{nextX, nextY});

                }


            }
        }


    }


}