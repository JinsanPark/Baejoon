import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N,M,count;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        count = 0;
        int u,v;
        visited = new boolean[N+1];

        map = new int[N + 1][N + 1];

        for (int i = 1; i <= M; i++) {

            String[] line = br.readLine().split(" ");
            u = Integer.parseInt(line[0]);
            v = Integer.parseInt(line[1]);

            map[u][v] = 1;
            map[v][u] = 1;

        }

        for (int i = 1; i <= N; i++) {



            if (visited[i] == false) {
                count++;
                dfs(i);
            };

        }


        System.out.println(count);

    }

    public static void dfs(int i) {

        visited[i] = true;

        for (int j = 1; j <= N; j++) {

            if (!visited[j] && map[i][j] == 1) {
                dfs(j);
            }
        }

    }

}