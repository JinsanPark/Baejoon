import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M, count;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M + 1];
        visited = new boolean[N + 1];


        for (int i = 1; i <= N; i++) {
            visited[i] = false;
        }

        dfs(1);

        System.out.println(sb);

    }

    public static void dfs(int i) {

        if (i > M) {
            for (int j = 1; j <= M; j++) {
                sb.append(arr[j]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int j = 1; j <= N; j++) {

            if (!visited[j]) {
                visited[j] = true;
                arr[i] = j;
                dfs(i + 1);
                visited[j] = false;
            }

        }


    }

}