import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int M,N,K;
    static int[][] map;
    static int count;

    static int[] dy = {-1,1,0,0};
    static int[] dx = {0,0,-1,1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");

        M = Integer.parseInt(input[0]);
        N = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);

        map = new int[M][N];

        for (int k = 0; k < K; k++) {

            input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);

            for (int i = y1; i < y2; i++) {

                for (int j = x1; j < x2; j++) {

                    map[i][j] = 1;

                }
            }
            
        }
        br.close();
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < M; i++) {

            for (int j = 0; j < N; j++) {

                if (map[i][j] == 0) {

                    count = 0;
                    dfs(i,j);
                    resultList.add(count);

                }

            }

        }

        System.out.println(resultList.size());

        Collections.sort(resultList);
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i) + " ");
        }


    }

    public static void dfs(int y, int x) {

        map[y][x] = 1;
        count++;

        for (int k = 0; k < 4; k++) {

            int ny = y + dy[k];
            int nx = x + dx[k];


            if (ny >= 0 && ny < M && nx >= 0 && nx < N && map[ny][nx] == 0) {

                dfs(ny,nx);

            }

        }

    }

}