import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] apartments;
    static boolean[][] visited;
    static int N;
    static int count;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        apartments = new int[N][N];
        visited = new boolean[N][N];
        count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < N; x++) {

            String line = br.readLine();

            for (int y = 0; y < N; y++) {

                apartments[x][y] = line.charAt(y) - 48;
                visited[x][y] = false;

            }
        }


        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {

                if (!visited[x][y] && apartments[x][y] == 1) {
                    count = 0;
                    dfs(x,y);
                    list.add(count);
                }

            }
        }

        Collections.sort(list);
        sb.append(list.size()).append("\n");

        for (int i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);


    }
    

    public static int dfs(int x, int y) {

        if (!visited[x][y]) {

            visited[x][y] = true;
            count++;
            int nx;
            int ny;

            for (int i = 0; i < 4; i++) {

                nx = x + dx[i];
                ny = y + dy[i];

                if (nx >= 0 && nx < N  && ny >= 0 && ny < N && !visited[nx][ny] && apartments[nx][ny] == 1) {
                    dfs(nx,ny);
                }

            }


        }

        return count;

    }

}