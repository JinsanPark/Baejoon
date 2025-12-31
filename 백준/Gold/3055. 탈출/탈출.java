import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int R, C, endX, endY, startX, startY;
    static char[][] map;
    static boolean visited[][];
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {

            String line = br.readLine();

            for (int j = 0; j < C; j++) {
                map[i][j] = line.charAt(j);

                if (map[i][j] == '*') {
                    visited[i][j] = true;
                    q.add(new int[]{i, j, 0,0});
                }

                if (map[i][j] == 'S') {

                    startX = i;
                    startY = j;

                }

                if (map[i][j] == 'D') {

                    endX = i;
                    endY = j;

                }

            }
        }

        q.add(new int[]{startX, startY, 0, 1});

        bfs();


    }

    public static void bfs() {

        while (!q.isEmpty()) {

            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            int curTime = cur[2];
            int type = cur[3];

            for (int i = 0; i < 4; i++) {

                if (type == 0) {

                    int nextX = curX + dx[i];
                    int nextY = curY + dy[i];

                    if (nextX >= 0 && nextY >= 0 && nextX < R && nextY < C && (map[nextX][nextY] == '.' || map[nextX][nextY] == 'S')) {

                        visited[nextX][nextY] = true;
                        q.add(new int[]{nextX, nextY, curTime + 1,0});
                        map[nextX][nextY] = '*';

                    }
                }

                else if (type == 1) {

                    int nextX = curX + dx[i];
                    int nextY = curY + dy[i];

                    if (nextX >= 0 && nextY >= 0 && nextX < R && nextY < C && map[nextX][nextY] == '.') {

                        visited[nextX][nextY] = true;
                        q.add(new int[]{nextX, nextY, curTime + 1,1});
                        map[nextX][nextY] = 'S';

                    } else if (nextX >= 0 && nextY >= 0 && nextX < R && nextY < C && map[nextX][nextY] == 'D') {

                        curTime += 1;
                        System.out.println(curTime);
                        return;

                    }
                }
            }
        }

            System.out.println("KAKTUS");

    }

}