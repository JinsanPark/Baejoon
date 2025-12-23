import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dx = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[][] map;
    static int T, I, N, startY, startX, endY, endX;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {

            I = Integer.parseInt(br.readLine());
            map = new int[I][I];

            StringTokenizer st = new StringTokenizer(br.readLine());
            startY = Integer.parseInt(st.nextToken());
            startX = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            endY = Integer.parseInt(st.nextToken());
            endX = Integer.parseInt(st.nextToken());

            bfs(startY, startX, endY, endX);

        }

    }


    public static void bfs(int y, int x, int endY, int endX) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{y, x});

        map[y][x] = 1;

        while (!q.isEmpty()) {

            int[] now = q.poll();
            int nowY = now[0];
            int nowX = now[1];

            if (nowY == endY && nowX == endX) {

                System.out.println(map[nowY][nowX] - 1);
                return;
            }

            for (int i = 0; i < 8; i++) {
                int ny = nowY + dy[i];
                int nx = nowX + dx[i];

                if (ny >= 0 && ny < I && nx >= 0 && nx < I && map[ny][nx] == 0) {

                    map[ny][nx] = map[nowY][nowX] + 1;

                    q.add(new int[]{ny, nx});

                }
            }

        }


    }


}