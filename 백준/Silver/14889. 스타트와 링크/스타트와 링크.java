import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static int[][] S;
    static int min;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        S = new int[N ][N];
        min = Integer.MAX_VALUE;
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {

            String[] inputs = br.readLine().split(" ");

            for (int j = 0; j < N; j++) {

            S[i][j] = Integer.parseInt(inputs[j]);

            }

        }

        dfs(0,0);
        System.out.println(min);

    }

    public static void dfs(int index, int num) {

        if ( num == N / 2) {

            int startTeam = 0;
            int linkTeam = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {

                    if (visited[i] && visited[j]) {

                        startTeam += S[i][j];

                    } else if (!visited[i] && !visited[j]) {

                        linkTeam += S[i][j];

                    }



                }
            }

            int result = Math.abs(startTeam - linkTeam);
            if(result < min) {
                min = result;
            }
            return;

        }

        for (int i = index; i < N; i++) {

            visited[i] = true;
            dfs(i+ 1, num + 1);
            visited[i] = false;

        }


    }

}