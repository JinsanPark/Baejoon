import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    static int n,m,x,y,start,end;
    static boolean[] visited;
    static int map[][];
    static int result = -1;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        start = Integer.parseInt(input[0]);
        end = Integer.parseInt(input[1]);
        m = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 1; i <= m; i++) {

            String[] line = br.readLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);

            map[x][y] = 1;
            map[y][x] = 1;

        }

        dfs(start, end, 0);
        System.out.println(result);

    }

    public static void dfs(int i, int j, int cnt) {

        visited[i] = true;

        if (i == j) {
            result = cnt;
            return;
        }

        for (int x = 1; x <= n; x++) {

            if (map[i][x] == 1 && !visited[x]) {
                dfs(x,j, cnt + 1);
            }
        }

    }
}