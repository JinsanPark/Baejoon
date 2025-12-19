import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] map;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {

            String[] input = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {

                map[i][j] = Integer.parseInt(input[j]);

            }


        }

        for (int i = 0; i < N; i++) {

            visited = new boolean[N];

            for (int j = 0; j < N; j++) {

                if(map[i][j] == 1 && !visited[j]) {

                    dfs(j);

                }

            }

            for (int j = 0; j < N; j++) {

                if(visited[j] == true) {

                    System.out.print("1" + " ");

                } else {
                    System.out.print("0" + " ");
                }
            }

            System.out.println();

        }

    }

    public static void dfs(int i) {

        visited[i] = true;

        for (int j = 0; j < N; j++) {

            if (map[i][j] == 1 && !visited[j]) {

                dfs(j);

            }

        }
    }

}