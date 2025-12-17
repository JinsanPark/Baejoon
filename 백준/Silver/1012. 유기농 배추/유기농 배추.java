import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int M,N,K,count;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {

            N = 0;
            M = 0;
            K = 0;
            count = 0;

            String[] line = br.readLine().split(" ");
            M = Integer.parseInt(line[0]);
            N = Integer.parseInt(line[1]);
            K = Integer.parseInt(line[2]);
            map = new int[N][M];
            visited = new boolean[N][M];



            for (int j = 0; j < K; j++) {

                String[] baechu = br.readLine().split(" ");
                int x = Integer.parseInt(baechu[0]);
                int y = Integer.parseInt(baechu[1]);

                map[y][x] = 1;


            }

            for (int r = 0; r < N; r++) {

                for (int c = 0; c < M; c++) {

                    if (map[r][c] == 1 && !visited[r][c]) {

                        count++;
                        dfs(r, c);

                    }

                }

            }

            System.out.println(count);

        }
    }


    public static void dfs(int r, int c) {

        visited[r][c] = true;

        for (int k = 0; k < 4; k++) {

            int nr = r+dx[k];
            int nc = c+dy[k];

            if (nr >= 0 && nr < N && nc >= 0 && nc < M) {
                if (map[nr][nc] == 1 && !visited[nr][nc]) {

                    dfs(nr,nc);

                }

            }

        }

    }


}